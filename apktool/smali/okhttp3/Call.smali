.class public interface abstract Lokhttp3/Call;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Call$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001:\u0001(J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J)\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001cH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u001b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000 H&\u00a2\u0006\u0004\u0008\u001e\u0010!J5\u0010\u001e\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001c2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H&\u00a2\u0006\u0004\u0008\u001e\u0010$J5\u0010\u001e\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00000 2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\"H&\u00a2\u0006\u0004\u0008\u001e\u0010%J\u000f\u0010&\u001a\u00020\u0000H&\u00a2\u0006\u0004\u0008&\u0010\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006)\u00c0\u0006\u0001"
    }
    d2 = {
        "Lokhttp3/Call;",
        "",
        "Lokhttp3/Request;",
        "request",
        "()Lokhttp3/Request;",
        "Lokhttp3/Response;",
        "execute",
        "()Lokhttp3/Response;",
        "Lokhttp3/Callback;",
        "responseCallback",
        "Ldn8;",
        "enqueue",
        "(Lokhttp3/Callback;)V",
        "cancel",
        "()V",
        "",
        "isExecuted",
        "()Z",
        "isCanceled",
        "Lta8;",
        "timeout",
        "()Lta8;",
        "Lokhttp3/EventListener;",
        "eventListener",
        "addEventListener",
        "(Lokhttp3/EventListener;)V",
        "",
        "T",
        "Lzu3;",
        "type",
        "tag",
        "(Lzu3;)Ljava/lang/Object;",
        "Ljava/lang/Class;",
        "(Ljava/lang/Class;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "computeIfAbsent",
        "(Lzu3;Ldn2;)Ljava/lang/Object;",
        "(Ljava/lang/Class;Ldn2;)Ljava/lang/Object;",
        "clone",
        "()Lokhttp3/Call;",
        "Factory",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract addEventListener(Lokhttp3/EventListener;)V
.end method

.method public abstract cancel()V
.end method

.method public abstract clone()Lokhttp3/Call;
.end method

.method public abstract enqueue(Lokhttp3/Callback;)V
.end method

.method public abstract execute()Lokhttp3/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract isCanceled()Z
.end method

.method public abstract isExecuted()Z
.end method

.method public abstract request()Lokhttp3/Request;
.end method

.method public abstract tag(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract tag(Ljava/lang/Class;Ldn2;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ldn2;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract tag(Lzu3;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzu3;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract tag(Lzu3;Ldn2;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzu3;",
            "Ldn2;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract timeout()Lta8;
.end method
