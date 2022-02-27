package org.example.service;

import com.github.husky_demos.user_service.v1.UserModel;
import com.github.husky_demos.user_service.v1.UserServiceGrpc;
import com.github.husky_demos.wallet_service.v1.WalletModel;
import com.github.husky_demos.wallet_service.v1.WalletServiceGrpc;
import com.google.rpc.Status;
import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;

public class UserService extends UserServiceGrpc.UserServiceImplBase {

    private final WalletServiceGrpc.WalletServiceBlockingStub walletService;

    public UserService(Channel walletServiceChannel) {
        walletService = WalletServiceGrpc.newBlockingStub(walletServiceChannel);
    }


    @Override
    public void login(UserModel.LoginRequest request, StreamObserver<UserModel.LoginResult> responseObserver) {
        try {
            WalletModel.Wallet wallet = walletService.queryByUserId(WalletModel.Id.newBuilder().build());
            System.out.println(wallet.toString());
        } catch (StatusRuntimeException e) {
            Status status = StatusProto.fromThrowable(e);
            responseObserver.onError(StatusProto.toStatusRuntimeException(status));
            return;
        }

        UserModel.LoginResult result = UserModel.LoginResult.newBuilder()
                .setUser(UserModel.User.newBuilder()
                        .setId("123")
                        .setNickName("husky")
                        .setLoginName("abc")
                        .setLoginPass("666")
                        .setIsLocking(false)
                        .build())
                .setToken("AAABBBCCC666")
                .setExpireTime(System.currentTimeMillis())
                .build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }
}
