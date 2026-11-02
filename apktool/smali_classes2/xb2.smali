.class public final Lxb2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:J


# direct methods
.method public constructor <init>(Lnm4;Ljava/lang/String;JLq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lxb2;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lxb2;->h0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lxb2;->i0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Lxb2;->j0:J

    .line 9
    .line 10
    invoke-direct {p0, v0, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lqc2;JLq51;B)V
    .locals 0

    .line 14
    iput-byte p5, p0, Lxb2;->g0:B

    iput-object p1, p0, Lxb2;->i0:Ljava/lang/Object;

    iput-wide p2, p0, Lxb2;->j0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lxb2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb71;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lxb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lxb2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lxb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lo05;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lxb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lxb2;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lxb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lo05;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lxb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lxb2;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lxb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 9

    .line 1
    iget-byte v0, p0, Lxb2;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lxb2;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, Lxb2;

    .line 9
    .line 10
    iget-object p2, p0, Lxb2;->h0:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p2

    .line 13
    check-cast v3, Lnm4;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    iget-wide v5, p0, Lxb2;->j0:J

    .line 19
    .line 20
    move-object v7, p1

    .line 21
    invoke-direct/range {v2 .. v7}, Lxb2;-><init>(Lnm4;Ljava/lang/String;JLq51;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_0
    move-object v7, p1

    .line 26
    new-instance v3, Lxb2;

    .line 27
    .line 28
    move-object v4, v1

    .line 29
    check-cast v4, Lqc2;

    .line 30
    .line 31
    iget-wide v5, p0, Lxb2;->j0:J

    .line 32
    .line 33
    const/4 v8, 0x1

    .line 34
    invoke-direct/range {v3 .. v8}, Lxb2;-><init>(Lqc2;JLq51;B)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v3, Lxb2;->h0:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v3

    .line 40
    :pswitch_1
    move-object v7, p1

    .line 41
    new-instance v3, Lxb2;

    .line 42
    .line 43
    move-object v4, v1

    .line 44
    check-cast v4, Lqc2;

    .line 45
    .line 46
    iget-wide v5, p0, Lxb2;->j0:J

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-direct/range {v3 .. v8}, Lxb2;-><init>(Lqc2;JLq51;B)V

    .line 50
    .line 51
    .line 52
    iput-object p2, v3, Lxb2;->h0:Ljava/lang/Object;

    .line 53
    .line 54
    return-object v3

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lxb2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-wide v2, p0, Lxb2;->j0:J

    .line 6
    .line 7
    iget-object v4, p0, Lxb2;->i0:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lxb2;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lnm4;

    .line 18
    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    new-instance p1, Ljava/lang/Long;

    .line 22
    .line 23
    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide/16 v5, -0x1

    .line 31
    .line 32
    cmp-long v0, v2, v5

    .line 33
    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    :goto_0
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/Long;

    .line 45
    .line 46
    invoke-direct {p1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v4, p1}, Lnm4;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_0
    iget-object p0, p0, Lxb2;->h0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lo05;

    .line 56
    .line 57
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast v4, Lqc2;

    .line 61
    .line 62
    iget-object p1, v4, Lqc2;->e:Ljs5;

    .line 63
    .line 64
    new-instance v0, Ljava/lang/Long;

    .line 65
    .line 66
    invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_1
    iget-object p0, p0, Lxb2;->h0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Lo05;

    .line 76
    .line 77
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    check-cast v4, Lqc2;

    .line 81
    .line 82
    iget-object p1, v4, Lqc2;->b:Ljs5;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/util/Set;

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    sget-object v0, Lm02;->X:Lm02;

    .line 93
    .line 94
    :cond_2
    check-cast v0, Ljava/lang/Iterable;

    .line 95
    .line 96
    new-instance v4, Lhu;

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    invoke-direct {v4, v0, v5}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lya2;

    .line 103
    .line 104
    const/4 v6, 0x5

    .line 105
    invoke-direct {v0, v6}, Lya2;-><init>(B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v0}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v4, Lbd;

    .line 113
    .line 114
    const/4 v6, 0x2

    .line 115
    invoke-direct {v4, v2, v3, v6}, Lbd;-><init>(JB)V

    .line 116
    .line 117
    .line 118
    new-instance v2, Lla2;

    .line 119
    .line 120
    invoke-direct {v2, v0, v5, v4}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lya2;

    .line 124
    .line 125
    const/4 v3, 0x6

    .line 126
    invoke-direct {v0, v3}, Lya2;-><init>(B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lw27;->o0(Lu27;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p0, p1, v0}, Lo05;->f(Ljs5;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-object v1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
