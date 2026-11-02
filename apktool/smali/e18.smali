.class public abstract Le18;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lxu4;

.field public static final b:Lxu4;


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
    const-class v1, Ld18;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "camerax.tag_bundle"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lnr4;->o(Lzu3;Ljava/lang/String;)Lxu4;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, Le18;->a:Lxu4;

    .line 18
    .line 19
    const-class v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "use_case_camera_state.tag"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lnr4;->o(Lzu3;Ljava/lang/String;)Lxu4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Le18;->b:Lxu4;

    .line 32
    .line 33
    return-void
.end method
