.class public final Lak3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic d:[Lnw3;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/ThreadLocal;

.field public final c:Lna1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmx5;

    .line 2
    .line 3
    const-class v1, Lak3;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmx5;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lyb6;->a:Lzb6;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lzb6;->h(Lmx5;)Lmw3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Lnw3;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    sput-object v1, Lak3;->d:[Lnw3;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lak3;->a:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lak3;->b:Ljava/lang/ThreadLocal;

    .line 15
    .line 16
    new-instance v0, Llr5;

    .line 17
    .line 18
    new-instance v1, Luh3;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Luh3;-><init>(Lak3;)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lvj2;

    .line 29
    .line 30
    const/16 v3, 0x9

    .line 31
    .line 32
    invoke-direct {v1, p0, v3}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2, v0, v1, v2}, Lx97;->R(Ljava/lang/String;Llr5;Lvj2;I)Lis5;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    sget-object v0, Lak3;->d:[Lnw3;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    aget-object v0, v0, v1

    .line 43
    .line 44
    invoke-virtual {p2, v0, p1}, Lis5;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lna1;

    .line 49
    .line 50
    iput-object p1, p0, Lak3;->c:Lna1;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Lgn2;)V
    .locals 3

    .line 1
    new-instance v0, Ljy2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, p1, v2, v1}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lb02;->X:Lb02;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lo05;

    .line 15
    .line 16
    return-void
.end method

.method public final b(Ljs5;Ljava/lang/Long;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr0;

    .line 5
    .line 6
    const/16 v5, 0x1a

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lb02;->X:Lb02;

    .line 16
    .line 17
    invoke-static {p0, v0}, Lz51;->R(Ls61;Lrn2;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
