.class public final Lqn0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:J

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLsn0;Lq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lqn0;->g0:B

    .line 15
    iput-wide p1, p0, Lqn0;->j0:J

    iput-object p3, p0, Lqn0;->k0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lkv1;JLq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lqn0;->g0:B

    .line 14
    iput-object p1, p0, Lqn0;->k0:Ljava/lang/Object;

    iput-wide p2, p0, Lqn0;->j0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lwa7;JLya7;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lqn0;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lqn0;->j0:J

    .line 7
    .line 8
    iput-object p4, p0, Lqn0;->k0:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p0, v0, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lqn0;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lqn0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lqn0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lqn0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lqn0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lqn0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lqn0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lqn0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lqn0;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lqn0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 10

    .line 1
    iget-byte v0, p0, Lqn0;->g0:B

    .line 2
    .line 3
    iget-wide v1, p0, Lqn0;->j0:J

    .line 4
    .line 5
    iget-object v3, p0, Lqn0;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v4, Lqn0;

    .line 11
    .line 12
    iget-object p2, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, p2

    .line 15
    check-cast v5, Lwa7;

    .line 16
    .line 17
    iget-wide v6, p0, Lqn0;->j0:J

    .line 18
    .line 19
    move-object v8, v3

    .line 20
    check-cast v8, Lya7;

    .line 21
    .line 22
    move-object v9, p1

    .line 23
    invoke-direct/range {v4 .. v9}, Lqn0;-><init>(Lwa7;JLya7;Lq51;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :pswitch_0
    move-object v9, p1

    .line 28
    new-instance p0, Lqn0;

    .line 29
    .line 30
    check-cast v3, Lkv1;

    .line 31
    .line 32
    invoke-direct {p0, v3, v1, v2, v9}, Lqn0;-><init>(Lkv1;JLq51;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    move-object v9, p1

    .line 39
    new-instance p0, Lqn0;

    .line 40
    .line 41
    check-cast v3, Lsn0;

    .line 42
    .line 43
    invoke-direct {p0, v1, v2, v3, v9}, Lqn0;-><init>(JLsn0;Lq51;)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lqn0;->g0:B

    .line 2
    .line 3
    sget-object v6, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-wide v1, p0, Lqn0;->j0:J

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v7, Lc71;->X:Lc71;

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object v9, p0, Lqn0;->k0:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v9, Lya7;

    .line 19
    .line 20
    iget-object v0, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lwa7;

    .line 23
    .line 24
    iget-boolean v10, p0, Lqn0;->h0:Z

    .line 25
    .line 26
    if-eqz v10, :cond_1

    .line 27
    .line 28
    if-ne v10, v8, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v0, p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v6, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lwa7;->a:Loi;

    .line 44
    .line 45
    new-instance v3, Lpf3;

    .line 46
    .line 47
    invoke-direct {v3, v1, v2}, Lpf3;-><init>(J)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v9, Lya7;->r0:Lwf7;

    .line 51
    .line 52
    iput-boolean v8, p0, Lqn0;->h0:Z

    .line 53
    .line 54
    move-object v1, v3

    .line 55
    const/4 v3, 0x0

    .line 56
    const/16 v5, 0xc

    .line 57
    .line 58
    move-object v4, p0

    .line 59
    invoke-static/range {v0 .. v5}, Loi;->a(Loi;Ljava/lang/Object;Lpk;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v7, :cond_2

    .line 64
    .line 65
    move-object v6, v7

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    check-cast v0, Lnk;

    .line 68
    .line 69
    iget-object v0, v0, Lnk;->b:Lhk;

    .line 70
    .line 71
    :goto_1
    return-object v6

    .line 72
    :pswitch_0
    iget-boolean v0, p0, Lqn0;->h0:Z

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    if-ne v0, v8, :cond_3

    .line 77
    .line 78
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v6, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lb71;

    .line 93
    .line 94
    check-cast v9, Lkv1;

    .line 95
    .line 96
    iget-object v3, v9, Lkv1;->N0:Lsn2;

    .line 97
    .line 98
    new-instance v5, Lz85;

    .line 99
    .line 100
    invoke-direct {v5, v1, v2}, Lz85;-><init>(J)V

    .line 101
    .line 102
    .line 103
    iput-boolean v8, p0, Lqn0;->h0:Z

    .line 104
    .line 105
    invoke-interface {v3, v0, v5, p0}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v7, :cond_5

    .line 110
    .line 111
    move-object v6, v7

    .line 112
    :cond_5
    :goto_2
    return-object v6

    .line 113
    :pswitch_1
    iget-boolean v0, p0, Lqn0;->h0:Z

    .line 114
    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    if-ne v0, v8, :cond_6

    .line 118
    .line 119
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v6, v3

    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lqn0;->i0:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lb71;

    .line 134
    .line 135
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    iput-boolean v8, p0, Lqn0;->h0:Z

    .line 139
    .line 140
    invoke-static {v1, v2, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v7, :cond_8

    .line 145
    .line 146
    move-object v6, v7

    .line 147
    goto :goto_4

    .line 148
    :cond_8
    :goto_3
    check-cast v9, Lsn0;

    .line 149
    .line 150
    const-wide/16 v0, 0x0

    .line 151
    .line 152
    invoke-virtual {v9, v0, v1}, Lsn0;->m(J)V

    .line 153
    .line 154
    .line 155
    :goto_4
    return-object v6

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
