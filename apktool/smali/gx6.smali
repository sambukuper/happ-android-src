.class public final Lgx6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lwe5;

.field public static final synthetic e:[Lnw3;


# instance fields
.field public final a:Lm0;

.field public final b:Lgn2;

.field public final c:Lte4;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    const-class v1, Lgx6;

    .line 4
    .line 5
    const-string v2, "scopeForOwnerModule"

    .line 6
    .line 7
    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Llx5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lnw3;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, Lgx6;->e:[Lnw3;

    .line 19
    .line 20
    new-instance v0, Lwe5;

    .line 21
    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lwe5;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lgx6;->d:Lwe5;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lm0;Lve4;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgx6;->a:Lm0;

    .line 5
    .line 6
    iput-object p3, p0, Lgx6;->b:Lgn2;

    .line 7
    .line 8
    new-instance p1, Lzk3;

    .line 9
    .line 10
    const/16 p3, 0x11

    .line 11
    .line 12
    invoke-direct {p1, p0, p3}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance p3, Lte4;

    .line 16
    .line 17
    invoke-direct {p3, p2, p1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Lgx6;->c:Lte4;

    .line 21
    .line 22
    return-void
.end method
