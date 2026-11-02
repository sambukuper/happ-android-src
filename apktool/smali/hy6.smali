.class public final Lhy6;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:J

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lip5;Ljava/lang/CharSequence;JLr68;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lhy6;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lhy6;->j0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lhy6;->k0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Lhy6;->i0:J

    .line 9
    .line 10
    iput-object p5, p0, Lhy6;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljh4;[BJLq51;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lhy6;->g0:B

    .line 18
    iput-object p1, p0, Lhy6;->j0:Ljava/lang/Object;

    iput-object p2, p0, Lhy6;->k0:Ljava/lang/Object;

    iput-object p3, p0, Lhy6;->l0:Ljava/lang/Object;

    iput-wide p4, p0, Lhy6;->i0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lsy6;JLba6;Lq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lhy6;->g0:B

    .line 17
    iput-object p1, p0, Lhy6;->k0:Ljava/lang/Object;

    iput-wide p2, p0, Lhy6;->i0:J

    iput-object p4, p0, Lhy6;->l0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lhy6;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lhy6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lhy6;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lhy6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lb71;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lhy6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lhy6;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lhy6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Lry6;

    .line 39
    .line 40
    check-cast p2, Lq51;

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Lhy6;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lhy6;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lhy6;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    iget-byte v0, p0, Lhy6;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lhy6;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lhy6;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Lhy6;

    .line 11
    .line 12
    iget-object p2, p0, Lhy6;->j0:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p2

    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Ljh4;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, [B

    .line 22
    .line 23
    iget-wide v7, p0, Lhy6;->i0:J

    .line 24
    .line 25
    move-object v9, p1

    .line 26
    invoke-direct/range {v3 .. v9}, Lhy6;-><init>(Ljava/lang/String;Ljh4;[BJLq51;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    move-object v9, p1

    .line 31
    new-instance v4, Lhy6;

    .line 32
    .line 33
    iget-object p1, p0, Lhy6;->j0:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v5, p1

    .line 36
    check-cast v5, Lip5;

    .line 37
    .line 38
    move-object v6, v2

    .line 39
    check-cast v6, Ljava/lang/CharSequence;

    .line 40
    .line 41
    iget-wide v7, p0, Lhy6;->i0:J

    .line 42
    .line 43
    check-cast v1, Lr68;

    .line 44
    .line 45
    move-object v10, v9

    .line 46
    move-object v9, v1

    .line 47
    invoke-direct/range {v4 .. v10}, Lhy6;-><init>(Lip5;Ljava/lang/CharSequence;JLr68;Lq51;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :pswitch_1
    move-object v9, p1

    .line 52
    new-instance v4, Lhy6;

    .line 53
    .line 54
    move-object v5, v2

    .line 55
    check-cast v5, Lsy6;

    .line 56
    .line 57
    iget-wide v6, p0, Lhy6;->i0:J

    .line 58
    .line 59
    move-object v8, v1

    .line 60
    check-cast v8, Lba6;

    .line 61
    .line 62
    invoke-direct/range {v4 .. v9}, Lhy6;-><init>(Lsy6;JLba6;Lq51;)V

    .line 63
    .line 64
    .line 65
    iput-object p2, v4, Lhy6;->j0:Ljava/lang/Object;

    .line 66
    .line 67
    return-object v4

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, Lhy6;->g0:B

    .line 4
    .line 5
    sget-object v6, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-wide v1, v5, Lhy6;->i0:J

    .line 8
    .line 9
    iget-object v3, v5, Lhy6;->l0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, v5, Lhy6;->k0:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    sget-object v8, Lc71;->X:Lc71;

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-boolean v0, v5, Lhy6;->h0:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v9, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v10

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v0, Ltp1;->a:Lnf1;

    .line 43
    .line 44
    sget-object v0, Lye1;->Z:Lye1;

    .line 45
    .line 46
    new-instance v10, Lkl8;

    .line 47
    .line 48
    iget-object v1, v5, Lhy6;->j0:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v11, v1

    .line 51
    check-cast v11, Ljava/lang/String;

    .line 52
    .line 53
    move-object v12, v4

    .line 54
    check-cast v12, Ljh4;

    .line 55
    .line 56
    move-object v13, v3

    .line 57
    check-cast v13, [B

    .line 58
    .line 59
    iget-wide v14, v5, Lhy6;->i0:J

    .line 60
    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    invoke-direct/range {v10 .. v16}, Lkl8;-><init>(Ljava/lang/String;Ljh4;[BJLq51;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v9, v5, Lhy6;->h0:Z

    .line 67
    .line 68
    invoke-static {v0, v10, v5}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-ne v0, v8, :cond_2

    .line 73
    .line 74
    move-object v0, v8

    .line 75
    :cond_2
    :goto_0
    return-object v0

    .line 76
    :pswitch_0
    move-object/from16 v16, v4

    .line 77
    .line 78
    check-cast v16, Ljava/lang/CharSequence;

    .line 79
    .line 80
    check-cast v3, Lr68;

    .line 81
    .line 82
    iget-object v0, v3, Lr68;->a:Lkd8;

    .line 83
    .line 84
    iget-boolean v3, v5, Lhy6;->h0:Z

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    if-ne v3, v9, :cond_3

    .line 89
    .line 90
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    move-object/from16 v4, v16

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v6, v10

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v5, Lhy6;->j0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lip5;

    .line 109
    .line 110
    iput-boolean v9, v5, Lhy6;->h0:Z

    .line 111
    .line 112
    move-object v15, v3

    .line 113
    check-cast v15, Lop5;

    .line 114
    .line 115
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    iget-wide v12, v5, Lhy6;->i0:J

    .line 126
    .line 127
    invoke-static {v12, v13}, Lf88;->b(J)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    :goto_1
    move-object v3, v10

    .line 134
    move-object/from16 v4, v16

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    new-instance v11, Lnp5;

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    invoke-direct/range {v11 .. v16}, Lnp5;-><init>(JLq51;Lop5;Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    move-object/from16 v4, v16

    .line 144
    .line 145
    iget-object v3, v15, Lop5;->a:Ls61;

    .line 146
    .line 147
    new-instance v7, Lmp5;

    .line 148
    .line 149
    invoke-direct {v7, v15, v11, v10}, Lmp5;-><init>(Lop5;Lrn2;Lq51;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3, v7, v5}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    :goto_2
    if-ne v3, v8, :cond_7

    .line 157
    .line 158
    move-object v6, v8

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    :goto_3
    check-cast v3, Lf88;

    .line 161
    .line 162
    if-eqz v3, :cond_8

    .line 163
    .line 164
    iget-wide v7, v3, Lf88;->a:J

    .line 165
    .line 166
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    iget-object v3, v3, Lh48;->Z:Ljava/lang/CharSequence;

    .line 171
    .line 172
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_8

    .line 177
    .line 178
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    iget-wide v3, v3, Lh48;->f0:J

    .line 183
    .line 184
    invoke-static {v3, v4, v1, v2}, Lf88;->a(JJ)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_8

    .line 189
    .line 190
    invoke-virtual {v0}, Lkd8;->d()Lh48;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget-wide v1, v1, Lh48;->f0:J

    .line 195
    .line 196
    invoke-static {v7, v8, v1, v2}, Lf88;->a(JJ)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-nez v1, :cond_8

    .line 201
    .line 202
    invoke-virtual {v0, v7, v8}, Lkd8;->j(J)V

    .line 203
    .line 204
    .line 205
    :cond_8
    :goto_4
    return-object v6

    .line 206
    :pswitch_1
    check-cast v4, Lsy6;

    .line 207
    .line 208
    iget-boolean v0, v5, Lhy6;->h0:Z

    .line 209
    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    if-ne v0, v9, :cond_9

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    invoke-static {v7}, Lbt;->i(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    move-object v6, v10

    .line 222
    goto :goto_5

    .line 223
    :cond_a
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v5, Lhy6;->j0:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lry6;

    .line 229
    .line 230
    invoke-virtual {v4, v1, v2}, Lsy6;->h(J)F

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    check-cast v3, Lba6;

    .line 235
    .line 236
    new-instance v2, Lfh;

    .line 237
    .line 238
    const/16 v7, 0x12

    .line 239
    .line 240
    invoke-direct {v2, v3, v4, v0, v7}, Lfh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 241
    .line 242
    .line 243
    iput-boolean v9, v5, Lhy6;->h0:Z

    .line 244
    .line 245
    const/4 v0, 0x7

    .line 246
    const/4 v3, 0x0

    .line 247
    invoke-static {v3, v3, v10, v0}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    const/4 v0, 0x0

    .line 252
    move-object v4, v2

    .line 253
    const/4 v2, 0x0

    .line 254
    invoke-static/range {v0 .. v5}, Lry7;->a(FFFLpk;Lrn2;Luy7;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v8, :cond_b

    .line 259
    .line 260
    move-object v6, v8

    .line 261
    :cond_b
    :goto_5
    return-object v6

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
