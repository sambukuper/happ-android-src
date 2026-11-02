.class public final Lqq1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:Z

.field public j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLq51;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lqq1;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lqq1;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p3, p0, Lqq1;->i0:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(ZLp91;Lq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lqq1;->g0:B

    .line 14
    iput-boolean p1, p0, Lqq1;->i0:Z

    iput-object p2, p0, Lqq1;->k0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lqq1;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lqq1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lqq1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lqq1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lqq1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lqq1;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lqq1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lqq1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lqq1;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lqq1;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lqq1;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lqq1;->k0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqq1;

    .line 9
    .line 10
    iget-object p2, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, p2

    .line 13
    check-cast v2, Lbx3;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Ly48;

    .line 17
    .line 18
    iget-boolean v4, p0, Lqq1;->i0:Z

    .line 19
    .line 20
    const/4 v6, 0x2

    .line 21
    move-object v5, p1

    .line 22
    invoke-direct/range {v1 .. v6}, Lqq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLq51;B)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v5, p1

    .line 27
    new-instance v2, Lqq1;

    .line 28
    .line 29
    iget-object p1, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    check-cast v3, Lci4;

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Lgg4;

    .line 36
    .line 37
    move-object v6, v5

    .line 38
    iget-boolean v5, p0, Lqq1;->i0:Z

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    invoke-direct/range {v2 .. v7}, Lqq1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLq51;B)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_1
    move-object v5, p1

    .line 46
    new-instance p1, Lqq1;

    .line 47
    .line 48
    iget-boolean p0, p0, Lqq1;->i0:Z

    .line 49
    .line 50
    check-cast v0, Lp91;

    .line 51
    .line 52
    invoke-direct {p1, p0, v0, v5}, Lqq1;-><init>(ZLp91;Lq51;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lqq1;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, Lqq1;->i0:Z

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lc71;->X:Lc71;

    .line 9
    .line 10
    iget-object v5, p0, Lqq1;->k0:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    sget-object v8, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v5, Ly48;

    .line 21
    .line 22
    iget-byte v0, p0, Lqq1;->h0:B

    .line 23
    .line 24
    const/4 v10, 0x3

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    if-eq v0, v6, :cond_1

    .line 28
    .line 29
    if-eq v0, v7, :cond_1

    .line 30
    .line 31
    if-ne v0, v10, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object v4, v9

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lbx3;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    packed-switch p1, :pswitch_data_1

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_0
    iget-object p1, v5, Ly48;->u0:Lr68;

    .line 59
    .line 60
    iput-byte v7, p0, Lqq1;->h0:B

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Lr68;->d(Luy7;)Ldn8;

    .line 63
    .line 64
    .line 65
    if-ne v8, v4, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :pswitch_1
    iget-object p1, v5, Ly48;->u0:Lr68;

    .line 69
    .line 70
    iput-byte v10, p0, Lqq1;->h0:B

    .line 71
    .line 72
    invoke-virtual {p1, v2, p0}, Lr68;->t(ZLs51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v4, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :pswitch_2
    iget-object p1, v5, Ly48;->u0:Lr68;

    .line 80
    .line 81
    iput-byte v6, p0, Lqq1;->h0:B

    .line 82
    .line 83
    invoke-virtual {p1, v1, p0}, Lr68;->c(ZLuy7;)Ldn8;

    .line 84
    .line 85
    .line 86
    if-ne v8, v4, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    :goto_1
    move-object v4, v8

    .line 90
    :goto_2
    return-object v4

    .line 91
    :pswitch_3
    move-object v0, v5

    .line 92
    check-cast v0, Lgg4;

    .line 93
    .line 94
    iget-object v5, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v10, v5

    .line 97
    check-cast v10, Lci4;

    .line 98
    .line 99
    iget-byte v5, p0, Lqq1;->h0:B

    .line 100
    .line 101
    if-eqz v5, :cond_6

    .line 102
    .line 103
    if-eq v5, v6, :cond_5

    .line 104
    .line 105
    if-ne v5, v7, :cond_4

    .line 106
    .line 107
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v4, v9

    .line 115
    goto :goto_8

    .line 116
    :cond_5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Ltp1;->a:Lnf1;

    .line 124
    .line 125
    sget-object p1, Lye1;->Z:Lye1;

    .line 126
    .line 127
    new-instance v3, Lzh4;

    .line 128
    .line 129
    invoke-direct {v3, v0, v10, v2, v9}, Lzh4;-><init>(Lgg4;Lci4;ZLq51;)V

    .line 130
    .line 131
    .line 132
    iput-byte v6, p0, Lqq1;->h0:B

    .line 133
    .line 134
    invoke-static {p1, v3, p0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v4, :cond_7

    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_7
    :goto_3
    check-cast p1, Lsj6;

    .line 142
    .line 143
    iget-object v11, p1, Lsj6;->X:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v12, v10, Lci4;->c:Loh7;

    .line 149
    .line 150
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    :cond_8
    invoke-virtual {v12}, Loh7;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    move-object v2, p1

    .line 158
    check-cast v2, Lng4;

    .line 159
    .line 160
    invoke-static {v11}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-nez v2, :cond_9

    .line 165
    .line 166
    move-object v2, v11

    .line 167
    goto :goto_4

    .line 168
    :cond_9
    new-instance v2, Llg4;

    .line 169
    .line 170
    const/4 v3, 0x6

    .line 171
    invoke-direct {v2, v0, v9, v3, v1}, Llg4;-><init>(Lgg4;Lj2;II)V

    .line 172
    .line 173
    .line 174
    :goto_4
    check-cast v2, Lng4;

    .line 175
    .line 176
    invoke-virtual {v12, p1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_8

    .line 181
    .line 182
    instance-of p1, v11, Lrj6;

    .line 183
    .line 184
    if-nez p1, :cond_a

    .line 185
    .line 186
    sget-object p1, Lpg4;->a:Lpg4;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_a
    sget-object p1, Lsg4;->a:Lsg4;

    .line 190
    .line 191
    :goto_5
    iput-byte v7, p0, Lqq1;->h0:B

    .line 192
    .line 193
    iget-object v0, v10, Lci4;->e:Lu77;

    .line 194
    .line 195
    invoke-virtual {v0, p1, p0}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-ne p0, v4, :cond_b

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_b
    move-object p0, v8

    .line 203
    :goto_6
    if-ne p0, v4, :cond_c

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_c
    :goto_7
    move-object v4, v8

    .line 207
    :goto_8
    return-object v4

    .line 208
    :pswitch_4
    const-string v0, "worksDomains:"

    .line 209
    .line 210
    iget-byte v1, p0, Lqq1;->h0:B

    .line 211
    .line 212
    if-eqz v1, :cond_f

    .line 213
    .line 214
    if-eq v1, v6, :cond_d

    .line 215
    .line 216
    if-ne v1, v7, :cond_e

    .line 217
    .line 218
    :cond_d
    iget-object p0, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Lp91;

    .line 221
    .line 222
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    goto :goto_a

    .line 226
    :catchall_0
    move-exception p0

    .line 227
    goto :goto_b

    .line 228
    :cond_e
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    move-object v4, v9

    .line 232
    goto :goto_d

    .line 233
    :cond_f
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object p1, v5

    .line 237
    check-cast p1, Lp91;

    .line 238
    .line 239
    if-nez v2, :cond_12

    .line 240
    .line 241
    :try_start_1
    iget-object v1, p1, Lp91;->j:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Ljava/util/List;

    .line 244
    .line 245
    if-eqz v1, :cond_12

    .line 246
    .line 247
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_10

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_10
    iput-object p1, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 255
    .line 256
    iput-byte v7, p0, Lqq1;->h0:B

    .line 257
    .line 258
    invoke-virtual {p1, p0}, Lp91;->m(Ls51;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    if-ne p0, v4, :cond_11

    .line 263
    .line 264
    goto :goto_d

    .line 265
    :cond_11
    move-object p0, p1

    .line 266
    goto :goto_a

    .line 267
    :cond_12
    :goto_9
    iput-object p1, p0, Lqq1;->j0:Ljava/lang/Object;

    .line 268
    .line 269
    iput-byte v6, p0, Lqq1;->h0:B

    .line 270
    .line 271
    invoke-virtual {p1, p0}, Lp91;->n(Ls51;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    if-ne p0, v4, :cond_11

    .line 276
    .line 277
    goto :goto_d

    .line 278
    :goto_a
    iget-object p1, p0, Lp91;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p1, Lyr2;

    .line 281
    .line 282
    iget-object p0, p0, Lp91;->k:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Ljava/util/List;

    .line 285
    .line 286
    new-instance v1, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    sget-object v0, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 299
    .line 300
    const/4 v1, 0x4

    .line 301
    invoke-static {p1, p0, v0, v1}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    .line 303
    .line 304
    goto :goto_c

    .line 305
    :goto_b
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 306
    .line 307
    if-nez p1, :cond_13

    .line 308
    .line 309
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 310
    .line 311
    if-nez p1, :cond_13

    .line 312
    .line 313
    :goto_c
    move-object v4, v8

    .line 314
    :goto_d
    return-object v4

    .line 315
    :cond_13
    throw p0

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :pswitch_data_1
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
