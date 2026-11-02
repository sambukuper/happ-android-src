.class public abstract Lt9;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ly2;

.field public static final b:Lbd1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Ly2;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt9;->a:Ly2;

    .line 8
    .line 9
    new-instance v0, Llh4;

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    invoke-direct {v0, v1}, Llh4;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lbd1;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lbd1;-><init>(Lqe2;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lt9;->b:Lbd1;

    .line 22
    .line 23
    return-void
.end method

.method public static a(Lla;Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg9;->a:Lsg8;

    .line 5
    .line 6
    new-instance v1, Ll9;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v0, v2}, Ll9;-><init>(Lla;Lpk;Lq51;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lf15;->X:Lf15;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, v1, p2}, Lla;->a(Ljava/lang/Object;Lf15;Ltn2;Lq51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, Lc71;->X:Lc71;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final b(Ldn2;Lrn2;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ln9;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ln9;

    .line 7
    .line 8
    iget v1, v0, Ln9;->g0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ln9;->g0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ln9;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls51;-><init>(Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ln9;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ln9;->g0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lf9; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    new-instance p2, Ls9;

    .line 49
    .line 50
    invoke-direct {p2, p0, p1, v2, v3}, Ls9;-><init>(Ldn2;Lrn2;Lq51;B)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Ln9;->g0:I

    .line 54
    .line 55
    invoke-static {p2, v0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_1
    .catch Lf9; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    sget-object p1, Lc71;->X:Lc71;

    .line 60
    .line 61
    if-ne p0, p1, :cond_3

    .line 62
    .line 63
    return-object p1

    .line 64
    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 65
    .line 66
    return-object p0
.end method
