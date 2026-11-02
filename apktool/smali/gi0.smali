.class public final Lgi0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ldq;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldq;

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldq;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lgi0;->a:Ldq;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lwx;Llk0;JLbm0;Lxd6;)Lt6;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    cmp-long v0, p4, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p4, 0x0

    .line 11
    move-object v5, p4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljx1;

    .line 14
    .line 15
    invoke-direct {v0, p4, p5}, Ljx1;-><init>(J)V

    .line 16
    .line 17
    .line 18
    move-object v5, v0

    .line 19
    :goto_0
    new-instance v1, Lhd;

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v4, p2

    .line 25
    invoke-direct/range {v1 .. v6}, Lhd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    move-object p2, v3

    .line 29
    new-instance p1, Lvz7;

    .line 30
    .line 31
    invoke-direct {p1, v1}, Lvz7;-><init>(Ldn2;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Lt6;

    .line 35
    .line 36
    if-nez p6, :cond_1

    .line 37
    .line 38
    new-instance p4, Lfg0;

    .line 39
    .line 40
    const/4 p5, 0x1

    .line 41
    invoke-direct {p4, p5}, Lfg0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    new-instance p6, Lbm0;

    .line 45
    .line 46
    iget-object p4, p4, Lfg0;->Y:Lk05;

    .line 47
    .line 48
    invoke-static {p4}, Lqd5;->c(Ll11;)Lqd5;

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    invoke-direct {p6, p4}, Lbm0;-><init>(Lqd5;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object p4, v2, Lgi0;->a:Ldq;

    .line 56
    .line 57
    move-object p5, p7

    .line 58
    move-object p7, p6

    .line 59
    move-object p6, p5

    .line 60
    move-object p5, p3

    .line 61
    move-object p3, v4

    .line 62
    invoke-direct/range {p0 .. p7}, Lt6;-><init>(Lvz7;Landroid/content/Context;Lwx;Ldq;Llk0;Lxd6;Lbm0;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method
