.class public final Ly81;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Z

.field public final synthetic j0:Z

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq51;Ldj4;Lux0;ZZ)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Ly81;->g0:B

    .line 17
    iput-object p2, p0, Ly81;->k0:Ljava/lang/Object;

    iput-object p3, p0, Ly81;->l0:Ljava/lang/Object;

    iput-boolean p4, p0, Ly81;->i0:Z

    iput-boolean p5, p0, Ly81;->j0:Z

    invoke-direct {p0, v0, p1}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lq51;Lgn2;Lql6;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Ly81;->g0:B

    .line 3
    .line 4
    iput-object p3, p0, Ly81;->k0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p4, p0, Ly81;->i0:Z

    .line 7
    .line 8
    iput-boolean p5, p0, Ly81;->j0:Z

    .line 9
    .line 10
    iput-object p2, p0, Ly81;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(ZZLq80;Ly05;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Ly81;->g0:B

    .line 18
    iput-boolean p1, p0, Ly81;->i0:Z

    iput-boolean p2, p0, Ly81;->j0:Z

    iput-object p3, p0, Ly81;->k0:Ljava/lang/Object;

    iput-object p4, p0, Ly81;->l0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Ly81;->g0:B

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
    invoke-virtual {p0, p2, p1}, Ly81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ly81;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ly81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ly81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ly81;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ly81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Ly81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ly81;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ly81;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte p2, p0, Ly81;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Ly81;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Ly81;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, Ly81;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Ldj4;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lux0;

    .line 17
    .line 18
    iget-boolean v6, p0, Ly81;->i0:Z

    .line 19
    .line 20
    iget-boolean v7, p0, Ly81;->j0:Z

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-direct/range {v2 .. v7}, Ly81;-><init>(Lq51;Ldj4;Lux0;ZZ)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v3, p1

    .line 28
    new-instance p1, Ly81;

    .line 29
    .line 30
    move-object v6, v1

    .line 31
    check-cast v6, Lq80;

    .line 32
    .line 33
    move-object v7, v0

    .line 34
    check-cast v7, Ly05;

    .line 35
    .line 36
    iget-boolean v4, p0, Ly81;->i0:Z

    .line 37
    .line 38
    iget-boolean v5, p0, Ly81;->j0:Z

    .line 39
    .line 40
    move-object v8, v3

    .line 41
    move-object v3, p1

    .line 42
    invoke-direct/range {v3 .. v8}, Ly81;-><init>(ZZLq80;Ly05;Lq51;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :pswitch_1
    move-object v3, p1

    .line 47
    new-instance p1, Ly81;

    .line 48
    .line 49
    move-object v6, v1

    .line 50
    check-cast v6, Lql6;

    .line 51
    .line 52
    iget-boolean v8, p0, Ly81;->j0:Z

    .line 53
    .line 54
    move-object v5, v0

    .line 55
    check-cast v5, Lgn2;

    .line 56
    .line 57
    iget-boolean v7, p0, Ly81;->i0:Z

    .line 58
    .line 59
    move-object v4, v3

    .line 60
    move-object v3, p1

    .line 61
    invoke-direct/range {v3 .. v8}, Ly81;-><init>(Lq51;Lgn2;Lql6;ZZ)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Ly81;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Ly81;->i0:Z

    .line 9
    .line 10
    iget-object v3, p0, Ly81;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lux0;

    .line 13
    .line 14
    iget-object v4, p0, Ly81;->k0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ldj4;

    .line 17
    .line 18
    sget-object v5, Lc71;->X:Lc71;

    .line 19
    .line 20
    iget-boolean v6, p0, Ly81;->h0:Z

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    if-ne v6, v1, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v4, Ldj4;->i:Lxg1;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iput-boolean v1, p0, Ly81;->h0:Z

    .line 46
    .line 47
    invoke-interface {p1, p0}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v5, :cond_2

    .line 52
    .line 53
    move-object v2, v5

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move p1, v7

    .line 64
    :goto_1
    const/4 v1, -0x1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p0, v4, Ldj4;->f:Lyz4;

    .line 68
    .line 69
    invoke-virtual {v4, p0, v1}, Ldj4;->c(Lyz4;I)V

    .line 70
    .line 71
    .line 72
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string p1, "Low Light Boost is disabled when expected frame rate range exceeds 30."

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p0}, Lux0;->l0(Ljava/lang/Throwable;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    iput-boolean v0, v4, Ldj4;->e:Z

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    iget-object p1, v4, Ldj4;->f:Lyz4;

    .line 88
    .line 89
    invoke-virtual {v4, p1, v1}, Ldj4;->c(Lyz4;I)V

    .line 90
    .line 91
    .line 92
    :cond_5
    iget-object p1, v4, Ldj4;->c:Lqq8;

    .line 93
    .line 94
    if-eqz p1, :cond_b

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    iget-object p1, v4, Ldj4;->f:Lyz4;

    .line 99
    .line 100
    invoke-virtual {v4, p1, v7}, Ldj4;->c(Lyz4;I)V

    .line 101
    .line 102
    .line 103
    :cond_6
    iget-boolean p0, p0, Ly81;->j0:Z

    .line 104
    .line 105
    iget-object p1, v4, Ldj4;->h:Lux0;

    .line 106
    .line 107
    if-eqz p0, :cond_8

    .line 108
    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    const-string p0, "There is a new enableLowLightBoost being set"

    .line 112
    .line 113
    invoke-static {p0, p1}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    iput-object v2, v4, Ldj4;->h:Lux0;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_8
    if-eqz p1, :cond_9

    .line 120
    .line 121
    invoke-static {v3, p1}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 122
    .line 123
    .line 124
    :cond_9
    :goto_2
    iput-object v3, v4, Ldj4;->h:Lux0;

    .line 125
    .line 126
    iget-object p0, v4, Ldj4;->a:Lkh7;

    .line 127
    .line 128
    if-eqz v0, :cond_a

    .line 129
    .line 130
    new-instance v2, Ljava/lang/Integer;

    .line 131
    .line 132
    const/4 p1, 0x6

    .line 133
    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 134
    .line 135
    .line 136
    :cond_a
    iget-object p1, p0, Lkh7;->d:Ljava/lang/Object;

    .line 137
    .line 138
    monitor-enter p1

    .line 139
    :try_start_0
    iput-object v2, p0, Lkh7;->k:Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    monitor-exit p1

    .line 142
    invoke-virtual {p0}, Lkh7;->f()Lux0;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0, v3}, Lzc1;->f0(Lxg1;Lux0;)V

    .line 147
    .line 148
    .line 149
    new-instance p0, Ld3;

    .line 150
    .line 151
    const/16 p1, 0xd

    .line 152
    .line 153
    invoke-direct {p0, v3, v4, p1}, Ld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, p0}, Lrm3;->D(Lgn2;)Lgq1;

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    move-object p0, v0

    .line 162
    monitor-exit p1

    .line 163
    throw p0

    .line 164
    :cond_b
    const-string p0, "Camera is not active."

    .line 165
    .line 166
    invoke-static {p0, v3}, Lp61;->y(Ljava/lang/String;Lux0;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    sget-object v2, Ldn8;->a:Ldn8;

    .line 170
    .line 171
    :goto_4
    return-object v2

    .line 172
    :pswitch_0
    sget-object v0, Lc71;->X:Lc71;

    .line 173
    .line 174
    iget-boolean v3, p0, Ly81;->h0:Z

    .line 175
    .line 176
    if-eqz v3, :cond_d

    .line 177
    .line 178
    if-ne v3, v1, :cond_c

    .line 179
    .line 180
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_c
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 185
    .line 186
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_d
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-boolean p1, p0, Ly81;->i0:Z

    .line 194
    .line 195
    if-eqz p1, :cond_e

    .line 196
    .line 197
    iget-object p1, p0, Ly81;->l0:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, Ly05;

    .line 200
    .line 201
    invoke-interface {p1}, Llh7;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_e

    .line 212
    .line 213
    iget-boolean p1, p0, Ly81;->j0:Z

    .line 214
    .line 215
    if-eqz p1, :cond_e

    .line 216
    .line 217
    iget-object p1, p0, Ly81;->k0:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p1, Lq80;

    .line 220
    .line 221
    iput-boolean v1, p0, Ly81;->h0:Z

    .line 222
    .line 223
    invoke-virtual {p1, v2, p0}, Lq80;->a(Ls86;Ls51;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-ne p0, v0, :cond_e

    .line 228
    .line 229
    move-object v2, v0

    .line 230
    goto :goto_6

    .line 231
    :cond_e
    :goto_5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 232
    .line 233
    :goto_6
    return-object v2

    .line 234
    :pswitch_1
    sget-object v0, Lc71;->X:Lc71;

    .line 235
    .line 236
    iget-boolean v3, p0, Ly81;->h0:Z

    .line 237
    .line 238
    if-eqz v3, :cond_10

    .line 239
    .line 240
    if-ne v3, v1, :cond_f

    .line 241
    .line 242
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_f
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 247
    .line 248
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    move-object p1, v2

    .line 252
    goto :goto_7

    .line 253
    :cond_10
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, Ly81;->k0:Ljava/lang/Object;

    .line 257
    .line 258
    move-object v5, p1

    .line 259
    check-cast v5, Lql6;

    .line 260
    .line 261
    iget-boolean v7, p0, Ly81;->i0:Z

    .line 262
    .line 263
    iget-boolean v6, p0, Ly81;->j0:Z

    .line 264
    .line 265
    iget-object p1, p0, Ly81;->l0:Ljava/lang/Object;

    .line 266
    .line 267
    move-object v4, p1

    .line 268
    check-cast v4, Lgn2;

    .line 269
    .line 270
    new-instance v2, Lx81;

    .line 271
    .line 272
    const/4 v3, 0x0

    .line 273
    invoke-direct/range {v2 .. v7}, Lx81;-><init>(Lq51;Lgn2;Lql6;ZZ)V

    .line 274
    .line 275
    .line 276
    iput-boolean v1, p0, Ly81;->h0:Z

    .line 277
    .line 278
    invoke-virtual {v5, v7, v2, p0}, Lql6;->q(ZLrn2;Ls51;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-ne p1, v0, :cond_11

    .line 283
    .line 284
    move-object p1, v0

    .line 285
    :cond_11
    :goto_7
    return-object p1

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
