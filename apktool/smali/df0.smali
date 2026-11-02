.class public final Ldf0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:J

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLef0;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Ldf0;->g0:B

    .line 3
    .line 4
    iput-wide p1, p0, Ldf0;->i0:J

    .line 5
    .line 6
    iput-object p3, p0, Ldf0;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLq51;B)V
    .locals 0

    .line 13
    iput-byte p5, p0, Ldf0;->g0:B

    iput-object p1, p0, Ldf0;->j0:Ljava/lang/Object;

    iput-wide p2, p0, Ldf0;->i0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Ldf0;->g0:B

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
    invoke-virtual {p0, p2, p1}, Ldf0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldf0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldf0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ldf0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ldf0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ldf0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Ldf0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ldf0;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ldf0;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte p2, p0, Ldf0;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Ldf0;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Ldf0;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La68;

    .line 12
    .line 13
    iget-wide v3, p0, Ldf0;->i0:J

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    move-object v5, p1

    .line 17
    invoke-direct/range {v1 .. v6}, Ldf0;-><init>(Ljava/lang/Object;JLq51;B)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :pswitch_0
    move-object v5, p1

    .line 22
    new-instance v2, Ldf0;

    .line 23
    .line 24
    move-object v3, v0

    .line 25
    check-cast v3, Lea6;

    .line 26
    .line 27
    move-object v6, v5

    .line 28
    iget-wide v4, p0, Ldf0;->i0:J

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    invoke-direct/range {v2 .. v7}, Ldf0;-><init>(Ljava/lang/Object;JLq51;B)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_1
    move-object v5, p1

    .line 36
    new-instance p1, Ldf0;

    .line 37
    .line 38
    iget-wide v1, p0, Ldf0;->i0:J

    .line 39
    .line 40
    check-cast v0, Lef0;

    .line 41
    .line 42
    invoke-direct {p1, v1, v2, v0, v5}, Ldf0;-><init>(JLef0;Lq51;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Ldf0;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lc71;->X:Lc71;

    .line 9
    .line 10
    iget-boolean v3, p0, Ldf0;->h0:Z

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-ne v3, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Ldf0;->j0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, La68;

    .line 32
    .line 33
    iget-object v3, p1, La68;->x0:Loi;

    .line 34
    .line 35
    iget-wide v4, p0, Ldf0;->i0:J

    .line 36
    .line 37
    move-wide v5, v4

    .line 38
    new-instance v4, Lz85;

    .line 39
    .line 40
    invoke-direct {v4, v5, v6}, Lz85;-><init>(J)V

    .line 41
    .line 42
    .line 43
    sget-object v5, Lo07;->d:Lwf7;

    .line 44
    .line 45
    iput-boolean v2, p0, Ldf0;->h0:Z

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/16 v8, 0xc

    .line 49
    .line 50
    move-object v7, p0

    .line 51
    invoke-static/range {v3 .. v8}, Loi;->a(Loi;Ljava/lang/Object;Lpk;Lgn2;Lq51;I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v0, :cond_2

    .line 56
    .line 57
    move-object v1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object v1, Ldn8;->a:Ldn8;

    .line 60
    .line 61
    :goto_1
    return-object v1

    .line 62
    :pswitch_0
    move-object v7, p0

    .line 63
    iget-object p0, v7, Ldf0;->j0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lea6;

    .line 66
    .line 67
    sget-object v0, Lc71;->X:Lc71;

    .line 68
    .line 69
    iget-boolean v3, v7, Ldf0;->h0:Z

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    if-ne v3, v2, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 91
    .line 92
    iget-wide v3, v7, Ldf0;->i0:J

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance p1, Leo4;

    .line 98
    .line 99
    invoke-direct {p1, v3, v4, v1}, Leo4;-><init>(JLq51;)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Lj31;

    .line 103
    .line 104
    const/4 v4, 0x7

    .line 105
    invoke-direct {v3, p1, v4}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    const/4 p1, -0x1

    .line 109
    invoke-static {v3, p1}, Lzc1;->o(Lxe2;I)Lxe2;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v3, Lar2;

    .line 114
    .line 115
    invoke-direct {v3, p0, v1, v2}, Lar2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Llf2;

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    invoke-direct {v1, p1, v3, v4}, Llf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lfg2;

    .line 125
    .line 126
    const/4 v3, 0x2

    .line 127
    invoke-direct {p1, p0, v3}, Lfg2;-><init>(Lea6;B)V

    .line 128
    .line 129
    .line 130
    iput-boolean v2, v7, Ldf0;->h0:Z

    .line 131
    .line 132
    invoke-virtual {v1, p1, v7}, Llf2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v0, :cond_5

    .line 137
    .line 138
    move-object v1, v0

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :goto_2
    sget-object v1, Ldn8;->a:Ldn8;

    .line 141
    .line 142
    :goto_3
    return-object v1

    .line 143
    :pswitch_1
    move-object v7, p0

    .line 144
    sget-object p0, Lc71;->X:Lc71;

    .line 145
    .line 146
    iget-boolean v0, v7, Ldf0;->h0:Z

    .line 147
    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    if-ne v0, v2, :cond_6

    .line 151
    .line 152
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 157
    .line 158
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-wide v0, v7, Ldf0;->i0:J

    .line 166
    .line 167
    iput-boolean v2, v7, Ldf0;->h0:Z

    .line 168
    .line 169
    invoke-static {v0, v1, v7}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, p0, :cond_8

    .line 174
    .line 175
    move-object v1, p0

    .line 176
    goto :goto_6

    .line 177
    :cond_8
    :goto_4
    iget-object p0, v7, Ldf0;->j0:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Lef0;

    .line 180
    .line 181
    iget-object p1, p0, Lef0;->q:Ljava/lang/Object;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    :try_start_0
    invoke-virtual {p0}, Lef0;->c()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_9

    .line 189
    .line 190
    iget-object v0, p0, Lef0;->s:Lmb6;

    .line 191
    .line 192
    sget-object v1, Lsh0;->p0:Lsh0;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_9

    .line 199
    .line 200
    iget-object v0, p0, Lef0;->s:Lmb6;

    .line 201
    .line 202
    sget-object v1, Lsh0;->o0:Lsh0;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_9

    .line 209
    .line 210
    invoke-virtual {p0}, Lef0;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lef0;->f:Lyx7;

    .line 214
    .line 215
    invoke-virtual {v0}, Lyx7;->k()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Lef0;->f()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Lef0;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    move-object p0, v0

    .line 227
    goto :goto_7

    .line 228
    :cond_9
    :goto_5
    monitor-exit p1

    .line 229
    sget-object v1, Ldn8;->a:Ldn8;

    .line 230
    .line 231
    :goto_6
    return-object v1

    .line 232
    :goto_7
    monitor-exit p1

    .line 233
    throw p0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
