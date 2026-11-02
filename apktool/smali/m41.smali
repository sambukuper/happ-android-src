.class public final Lm41;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public final synthetic h0:J

.field public i0:Z

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;

.field public final synthetic m0:Ljava/lang/Object;

.field public final synthetic n0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqo8;Lo41;Lw80;JLbm3;Lq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lm41;->g0:B

    .line 23
    iput-object p1, p0, Lm41;->k0:Ljava/lang/Object;

    iput-object p2, p0, Lm41;->l0:Ljava/lang/Object;

    iput-object p3, p0, Lm41;->m0:Ljava/lang/Object;

    iput-wide p4, p0, Lm41;->h0:J

    iput-object p6, p0, Lm41;->n0:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lz47;Lf84;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lm41;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lm41;->j0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lm41;->k0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p3, p0, Lm41;->h0:J

    .line 9
    .line 10
    iput-object p5, p0, Lm41;->l0:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p6, p0, Lm41;->m0:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p7, p0, Lm41;->n0:Ljava/lang/Object;

    .line 15
    .line 16
    iput-boolean p8, p0, Lm41;->i0:Z

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p9}, Luy7;-><init>(ILq51;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lm41;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lm41;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lm41;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lm41;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lry6;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lm41;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lm41;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lm41;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lm41;->g0:B

    .line 4
    .line 5
    iget-object v2, v0, Lm41;->n0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Lm41;->m0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lm41;->l0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lm41;->k0:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v6, Lm41;

    .line 17
    .line 18
    iget-object v1, v0, Lm41;->j0:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v7, v1

    .line 21
    check-cast v7, Lz47;

    .line 22
    .line 23
    move-object v8, v5

    .line 24
    check-cast v8, Lf84;

    .line 25
    .line 26
    move-object v11, v4

    .line 27
    check-cast v11, Ljava/net/Proxy;

    .line 28
    .line 29
    move-object v12, v3

    .line 30
    check-cast v12, Ljava/util/HashMap;

    .line 31
    .line 32
    move-object v13, v2

    .line 33
    check-cast v13, Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v14, v0, Lm41;->i0:Z

    .line 36
    .line 37
    iget-wide v9, v0, Lm41;->h0:J

    .line 38
    .line 39
    move-object/from16 v15, p1

    .line 40
    .line 41
    invoke-direct/range {v6 .. v15}, Lm41;-><init>(Lz47;Lf84;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V

    .line 42
    .line 43
    .line 44
    return-object v6

    .line 45
    :pswitch_0
    new-instance v7, Lm41;

    .line 46
    .line 47
    move-object v8, v5

    .line 48
    check-cast v8, Lqo8;

    .line 49
    .line 50
    move-object v9, v4

    .line 51
    check-cast v9, Lo41;

    .line 52
    .line 53
    move-object v10, v3

    .line 54
    check-cast v10, Lw80;

    .line 55
    .line 56
    iget-wide v11, v0, Lm41;->h0:J

    .line 57
    .line 58
    move-object v13, v2

    .line 59
    check-cast v13, Lbm3;

    .line 60
    .line 61
    move-object/from16 v14, p1

    .line 62
    .line 63
    invoke-direct/range {v7 .. v14}, Lm41;-><init>(Lqo8;Lo41;Lw80;JLbm3;Lq51;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v0, p2

    .line 67
    .line 68
    iput-object v0, v7, Lm41;->j0:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v7

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lm41;->g0:B

    .line 4
    .line 5
    iget-object v2, v1, Lm41;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v1, Lm41;->n0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v1, Lm41;->m0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v1, Lm41;->l0:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const-string v8, ""

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lm41;->j0:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v9, v0

    .line 26
    check-cast v9, Lz47;

    .line 27
    .line 28
    move-object v10, v2

    .line 29
    check-cast v10, Lf84;

    .line 30
    .line 31
    iget-wide v13, v1, Lm41;->h0:J

    .line 32
    .line 33
    move-object v15, v7

    .line 34
    check-cast v15, Ljava/net/Proxy;

    .line 35
    .line 36
    move-object/from16 v16, v6

    .line 37
    .line 38
    check-cast v16, Ljava/util/HashMap;

    .line 39
    .line 40
    move-object/from16 v17, v5

    .line 41
    .line 42
    check-cast v17, Ljava/lang/String;

    .line 43
    .line 44
    iget-boolean v0, v1, Lm41;->i0:Z

    .line 45
    .line 46
    :try_start_0
    new-instance v2, Lyf8;

    .line 47
    .line 48
    invoke-virtual {v9}, Lz47;->o()Ly5;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    const/4 v12, 0x0

    .line 53
    move/from16 v18, v0

    .line 54
    .line 55
    invoke-virtual/range {v10 .. v18}, Lf84;->b(Ly5;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lzf6;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v2, v0, v8, v3}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 65
    .line 66
    if-nez v2, :cond_c

    .line 67
    .line 68
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 69
    .line 70
    if-nez v2, :cond_c

    .line 71
    .line 72
    new-instance v2, Lrj6;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    move-object v15, v7

    .line 78
    check-cast v15, Ljava/net/Proxy;

    .line 79
    .line 80
    move-object/from16 v16, v6

    .line 81
    .line 82
    check-cast v16, Ljava/util/HashMap;

    .line 83
    .line 84
    move-object/from16 v17, v5

    .line 85
    .line 86
    check-cast v17, Ljava/lang/String;

    .line 87
    .line 88
    iget-boolean v0, v1, Lm41;->i0:Z

    .line 89
    .line 90
    invoke-static {v2}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v5, :cond_0

    .line 95
    .line 96
    check-cast v2, Lyf8;

    .line 97
    .line 98
    goto/16 :goto_8

    .line 99
    .line 100
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const/4 v6, 0x0

    .line 105
    iget-wide v13, v1, Lm41;->h0:J

    .line 106
    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    const-string v1, "Connection reset"

    .line 110
    .line 111
    invoke-static {v2, v1, v6}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ne v1, v4, :cond_4

    .line 116
    .line 117
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v1, v9, Lz47;->f0:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Lps;

    .line 123
    .line 124
    const-string v2, "Connection"

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Lps;->e(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :try_start_1
    new-instance v1, Lyf8;

    .line 130
    .line 131
    invoke-virtual {v9}, Lz47;->o()Ly5;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    const/4 v12, 0x0

    .line 136
    move/from16 v18, v0

    .line 137
    .line 138
    invoke-virtual/range {v10 .. v18}, Lf84;->b(Ly5;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lzf6;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {v1, v0, v8, v3}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 148
    .line 149
    if-nez v1, :cond_3

    .line 150
    .line 151
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 152
    .line 153
    if-nez v1, :cond_3

    .line 154
    .line 155
    new-instance v1, Lrj6;

    .line 156
    .line 157
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-nez v0, :cond_1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_1
    new-instance v1, Lyf8;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-nez v2, :cond_2

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    if-nez v2, :cond_2

    .line 180
    .line 181
    move-object v2, v8

    .line 182
    :cond_2
    invoke-direct {v1, v3, v2, v0}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :goto_2
    check-cast v1, Lyf8;

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_3
    throw v0

    .line 189
    :cond_4
    move/from16 v18, v0

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_5

    .line 196
    .line 197
    const-string v1, "timeout"

    .line 198
    .line 199
    invoke-static {v0, v1, v6}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-ne v0, v4, :cond_5

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_5
    instance-of v0, v5, Ljava/io/IOException;

    .line 207
    .line 208
    if-eqz v0, :cond_9

    .line 209
    .line 210
    :goto_3
    :try_start_2
    new-instance v0, Lyf8;

    .line 211
    .line 212
    invoke-virtual {v9}, Lz47;->o()Ly5;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const/4 v12, 0x1

    .line 217
    invoke-virtual/range {v10 .. v18}, Lf84;->b(Ly5;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lzf6;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-direct {v0, v1, v8, v3}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :catchall_2
    move-exception v0

    .line 226
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 227
    .line 228
    if-nez v1, :cond_8

    .line 229
    .line 230
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 231
    .line 232
    if-nez v1, :cond_8

    .line 233
    .line 234
    new-instance v1, Lrj6;

    .line 235
    .line 236
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    move-object v0, v1

    .line 240
    :goto_4
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-nez v1, :cond_6

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_6
    new-instance v0, Lyf8;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    if-nez v2, :cond_7

    .line 254
    .line 255
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    if-nez v2, :cond_7

    .line 260
    .line 261
    move-object v2, v8

    .line 262
    :cond_7
    invoke-direct {v0, v3, v2, v1}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :goto_5
    move-object v1, v0

    .line 266
    check-cast v1, Lyf8;

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_8
    throw v0

    .line 270
    :cond_9
    move-object v1, v3

    .line 271
    :goto_6
    if-nez v1, :cond_b

    .line 272
    .line 273
    new-instance v0, Lyf8;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-nez v1, :cond_a

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_a
    move-object v8, v1

    .line 283
    :goto_7
    invoke-direct {v0, v3, v8, v5}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move-object v2, v0

    .line 287
    goto :goto_8

    .line 288
    :cond_b
    move-object v2, v1

    .line 289
    :goto_8
    return-object v2

    .line 290
    :cond_c
    throw v0

    .line 291
    :pswitch_0
    check-cast v6, Lw80;

    .line 292
    .line 293
    check-cast v7, Lo41;

    .line 294
    .line 295
    check-cast v2, Lqo8;

    .line 296
    .line 297
    iget-boolean v0, v1, Lm41;->i0:Z

    .line 298
    .line 299
    if-eqz v0, :cond_e

    .line 300
    .line 301
    if-ne v0, v4, :cond_d

    .line 302
    .line 303
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_d
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 308
    .line 309
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v1, Lm41;->j0:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Lry6;

    .line 319
    .line 320
    iget-wide v8, v1, Lm41;->h0:J

    .line 321
    .line 322
    invoke-virtual {v7, v6, v8, v9}, Lo41;->Y0(Lw80;J)F

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    iput v3, v2, Lqo8;->e:F

    .line 327
    .line 328
    check-cast v5, Lbm3;

    .line 329
    .line 330
    new-instance v3, Lsn;

    .line 331
    .line 332
    invoke-direct {v3, v7, v2, v5, v0}, Lsn;-><init>(Lo41;Lqo8;Lbm3;Lry6;)V

    .line 333
    .line 334
    .line 335
    new-instance v0, Lg00;

    .line 336
    .line 337
    const/4 v5, 0x5

    .line 338
    invoke-direct {v0, v7, v2, v6, v5}, Lg00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 339
    .line 340
    .line 341
    iput-boolean v4, v1, Lm41;->i0:Z

    .line 342
    .line 343
    invoke-virtual {v2, v3, v0, v1}, Lqo8;->a(Lsn;Lg00;Ls51;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    sget-object v3, Lc71;->X:Lc71;

    .line 348
    .line 349
    if-ne v0, v3, :cond_f

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_f
    :goto_9
    sget-object v3, Ldn8;->a:Ldn8;

    .line 353
    .line 354
    :goto_a
    return-object v3

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
