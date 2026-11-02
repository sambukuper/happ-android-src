.class public abstract Lsj0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lxu4;

.field public static final b:Lxu4;

.field public static final c:Lxu4;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lxu4;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    sget-object v0, Lyb6;->a:Lzb6;

    .line 4
    .line 5
    const-class v1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "androidx.camera.camera2.pipe.extensionMode"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lnr4;->o(Lzu3;Ljava/lang/String;)Lxu4;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, Lsj0;->a:Lxu4;

    .line 18
    .line 19
    const-class v1, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "androidx.camera.camera2.pipe.captureRequestTag"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lnr4;->o(Lzu3;Ljava/lang/String;)Lxu4;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Lsj0;->b:Lxu4;

    .line 32
    .line 33
    const-class v1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "androidx.camera.camera2.pipe.ignore3ARequiredParameters"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lnr4;->o(Lzu3;Ljava/lang/String;)Lxu4;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lsj0;->c:Lxu4;

    .line 46
    .line 47
    return-void
.end method
