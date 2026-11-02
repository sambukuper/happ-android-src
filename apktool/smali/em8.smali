.class public final Lem8;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public g0:Z

.field public synthetic h0:J


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lze2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    check-cast p4, Lq51;

    .line 12
    .line 13
    new-instance p2, Lem8;

    .line 14
    .line 15
    const/4 p3, 0x4

    .line 16
    invoke-direct {p2, p3, p4}, Luy7;-><init>(ILq51;)V

    .line 17
    .line 18
    .line 19
    iput-wide p0, p2, Lem8;->h0:J

    .line 20
    .line 21
    sget-object p0, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Lem8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lem8;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-wide v2, p0, Lem8;->h0:J

    .line 23
    .line 24
    invoke-static {}, Llh4;->P0()Llh4;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget v0, Lfm8;->a:I

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-wide/16 v4, 0x7530

    .line 34
    .line 35
    mul-long/2addr v2, v4

    .line 36
    sget p1, Lfm8;->a:I

    .line 37
    .line 38
    int-to-long v4, p1

    .line 39
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iput-boolean v1, p0, Lem8;->g0:Z

    .line 44
    .line 45
    invoke-static {v2, v3, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object p1, Lc71;->X:Lc71;

    .line 50
    .line 51
    if-ne p0, p1, :cond_2

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    return-object p0
.end method
