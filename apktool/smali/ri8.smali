.class public abstract Lri8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public a(Ld50;)Lri8;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public c()Ltr3;
    .locals 0

    .line 1
    sget-object p0, Ltr3;->f0:Ltr3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Ljava/lang/Object;Lgr3;)Lz76;
    .locals 3

    .line 1
    new-instance v0, Lz76;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lz76;-><init>(Ljava/lang/Object;Lgr3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lri8;->c()Ltr3;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 p2, 0x3

    .line 15
    if-eqz p1, :cond_4

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq p1, v2, :cond_3

    .line 20
    .line 21
    if-eq p1, v1, :cond_2

    .line 22
    .line 23
    if-eq p1, p2, :cond_1

    .line 24
    .line 25
    const/4 p2, 0x4

    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    iput p2, v0, Lz76;->X:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lri8;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iput-object p0, v0, Lz76;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    sget p0, Lev8;->a:I

    .line 38
    .line 39
    const-string p0, "Internal error: this code path should never get executed"

    .line 40
    .line 41
    invoke-static {p0}, Lkp5;->t(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_1
    const/4 p1, 0x5

    .line 47
    iput p1, v0, Lz76;->X:I

    .line 48
    .line 49
    invoke-virtual {p0}, Lri8;->b()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iput-object p0, v0, Lz76;->h0:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    iput v2, v0, Lz76;->X:I

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    iput v1, v0, Lz76;->X:I

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_4
    iput p2, v0, Lz76;->X:I

    .line 63
    .line 64
    invoke-virtual {p0}, Lri8;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, v0, Lz76;->h0:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v0
.end method

.method public abstract e(Lro3;Lz76;)Lz76;
.end method

.method public f(Lro3;Lz76;)Lz76;
    .locals 1

    .line 1
    if-nez p2, :cond_2

    .line 2
    .line 3
    iget-object p0, p2, Lz76;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lgr3;

    .line 6
    .line 7
    sget-object v0, Lgr3;->f0:Lgr3;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lro3;->J()V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    sget-object v0, Lgr3;->g0:Lgr3;

    .line 16
    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lro3;->D()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-object p2

    .line 23
    :cond_2
    invoke-virtual {p1, p2}, Lro3;->f1(Lz76;)V

    .line 24
    .line 25
    .line 26
    return-object p2
.end method
