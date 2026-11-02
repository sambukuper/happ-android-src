.class public final Landroidx/camera/camera2/Camera2Config$DefaultProvider;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lam0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/camera/camera2/Camera2Config$DefaultProvider",
        "Lam0;",
        "<init>",
        "()V",
        "Lbm0;",
        "getCameraXConfig",
        "()Lbm0;",
        "camera-camera2"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCameraXConfig()Lbm0;
    .locals 2

    .line 1
    new-instance p0, Lgi0;

    .line 2
    .line 3
    invoke-direct {p0}, Lgi0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lfg0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Lfg0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lbm0;->Y:Lzx;

    .line 13
    .line 14
    iget-object v0, v0, Lfg0;->Y:Lk05;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Luf0;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lbm0;->Z:Lzx;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lvf0;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lbm0;->f0:Lzx;

    .line 35
    .line 36
    invoke-virtual {v0, v1, p0}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lbm0;->n0:Lzx;

    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0, p0, v1}, Lk05;->o(Lzx;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lbm0;

    .line 47
    .line 48
    invoke-static {v0}, Lqd5;->c(Ll11;)Lqd5;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p0, v0}, Lbm0;-><init>(Lqd5;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method
