.class public final Lcb1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcb1;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lcb1;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lcb1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lq51;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcb1;->m(Lq51;)Lq51;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcb1;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lcb1;->m(Lq51;)Lq51;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcb1;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lcb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-virtual {p0, p1}, Lcb1;->m(Lq51;)Lq51;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcb1;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lcb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Lq51;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lcb1;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lcb1;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcb1;

    .line 9
    .line 10
    check-cast p0, Lwq8;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p1, v1}, Lcb1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lcb1;

    .line 18
    .line 19
    check-cast p0, Lk92;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v1}, Lcb1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Lcb1;

    .line 27
    .line 28
    check-cast p0, Lib1;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, p1, v1}, Lcb1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lcb1;->g0:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v6, v1, Lcb1;->j0:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v6, Lwq8;

    .line 18
    .line 19
    iget-object v6, v6, Lwq8;->c:Ljr8;

    .line 20
    .line 21
    iget-byte v0, v1, Lcb1;->h0:B

    .line 22
    .line 23
    const/4 v8, 0x4

    .line 24
    const/4 v9, 0x3

    .line 25
    const-string v10, "CXCP"

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    if-eq v0, v4, :cond_3

    .line 30
    .line 31
    if-eq v0, v5, :cond_2

    .line 32
    .line 33
    if-eq v0, v9, :cond_1

    .line 34
    .line 35
    if-ne v0, v8, :cond_0

    .line 36
    .line 37
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    .line 39
    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move-object v3, v7

    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_2
    iget-object v0, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 58
    .line 59
    :try_start_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    .line 62
    move-object/from16 v0, p1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object v4, v2

    .line 67
    move-object v2, v0

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    :try_start_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 70
    .line 71
    .line 72
    move-object/from16 v0, p1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v10}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    :try_start_3
    invoke-virtual {v6}, Ljr8;->a()Lqi0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-byte v4, v1, Lcb1;->h0:B

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lqi0;->k(Ls51;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne v0, v3, :cond_5

    .line 92
    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :cond_5
    :goto_0
    move-object v2, v0

    .line 96
    check-cast v2, Ljava/lang/AutoCloseable;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 97
    .line 98
    :try_start_4
    move-object v0, v2

    .line 99
    check-cast v0, Lti0;

    .line 100
    .line 101
    iput-object v2, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-byte v5, v1, Lcb1;->h0:B

    .line 104
    .line 105
    const-wide/16 v4, 0x0

    .line 106
    .line 107
    const/16 v11, 0x38

    .line 108
    .line 109
    invoke-static {v0, v4, v5, v11}, Lti0;->m(Lti0;JI)Lux0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-ne v0, v3, :cond_6

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_6
    :goto_1
    check-cast v0, Lxg1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 117
    .line 118
    :try_start_5
    invoke-static {v2, v7}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :goto_2
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    :try_start_7
    invoke-static {v4, v2}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 128
    :catch_0
    invoke-static {v10}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    sget-object v0, Lwq8;->l:Lux0;

    .line 132
    .line 133
    :goto_3
    iput-object v7, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 134
    .line 135
    iput-byte v9, v1, Lcb1;->h0:B

    .line 136
    .line 137
    invoke-interface {v0, v1}, Lxg1;->J0(Lq51;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-ne v0, v3, :cond_7

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_7
    :goto_4
    :try_start_8
    invoke-virtual {v6}, Ljr8;->a()Lqi0;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-byte v8, v1, Lcb1;->h0:B

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lqi0;->k(Ls51;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-ne v0, v3, :cond_8

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_8
    :goto_5
    move-object v1, v0

    .line 158
    check-cast v1, Ljava/lang/AutoCloseable;
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_1

    .line 159
    .line 160
    :try_start_9
    move-object v11, v1

    .line 161
    check-cast v11, Lti0;

    .line 162
    .line 163
    sget-object v0, Lii0;->a:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 164
    .line 165
    invoke-static {v0}, Leu;->X([Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v17

    .line 180
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    const/16 v18, 0x7

    .line 184
    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    invoke-static/range {v11 .. v18}, Luh0;->g(Lti0;Ls7;Lt7;Li00;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)Lxg1;

    .line 189
    .line 190
    .line 191
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 192
    :try_start_a
    invoke-static {v1, v7}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_1

    .line 193
    .line 194
    .line 195
    :goto_6
    move-object v3, v0

    .line 196
    goto :goto_7

    .line 197
    :catchall_2
    move-exception v0

    .line 198
    move-object v2, v0

    .line 199
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 200
    :catchall_3
    move-exception v0

    .line 201
    :try_start_c
    invoke-static {v1, v2}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    throw v0
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_1

    .line 205
    :catch_1
    invoke-static {v10}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    sget-object v0, Lwq8;->l:Lux0;

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :goto_7
    return-object v3

    .line 212
    :pswitch_0
    check-cast v6, Lk92;

    .line 213
    .line 214
    iget-byte v0, v1, Lcb1;->h0:B

    .line 215
    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    if-eq v0, v4, :cond_a

    .line 219
    .line 220
    if-ne v0, v5, :cond_9

    .line 221
    .line 222
    iget-object v0, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 223
    .line 224
    move-object v1, v0

    .line 225
    check-cast v1, Ljava/io/FileInputStream;

    .line 226
    .line 227
    :try_start_d
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 228
    .line 229
    .line 230
    move-object/from16 v0, p1

    .line 231
    .line 232
    goto :goto_c

    .line 233
    :catchall_4
    move-exception v0

    .line 234
    move-object v2, v1

    .line 235
    :goto_8
    move-object v1, v0

    .line 236
    goto :goto_d

    .line 237
    :cond_9
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    move-object v3, v7

    .line 241
    goto/16 :goto_f

    .line 242
    .line 243
    :cond_a
    iget-object v0, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 244
    .line 245
    move-object v2, v0

    .line 246
    check-cast v2, Ljava/io/FileInputStream;

    .line 247
    .line 248
    :try_start_e
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 249
    .line 250
    .line 251
    move-object/from16 v0, p1

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :catchall_5
    move-exception v0

    .line 255
    move-object v8, v2

    .line 256
    move-object v2, v0

    .line 257
    goto :goto_b

    .line 258
    :cond_b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :try_start_f
    new-instance v2, Ljava/io/FileInputStream;

    .line 262
    .line 263
    iget-object v0, v6, Lk92;->a:Ljava/io/File;

    .line 264
    .line 265
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_f
    .catch Ljava/io/FileNotFoundException; {:try_start_f .. :try_end_f} :catch_2

    .line 266
    .line 267
    .line 268
    :try_start_10
    iput-object v2, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 269
    .line 270
    iput-byte v4, v1, Lcb1;->h0:B

    .line 271
    .line 272
    invoke-static {v2}, Lqe4;->K0(Ljava/io/FileInputStream;)Lo05;

    .line 273
    .line 274
    .line 275
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 276
    if-ne v0, v3, :cond_c

    .line 277
    .line 278
    goto :goto_f

    .line 279
    :cond_c
    :goto_9
    :try_start_11
    invoke-static {v2, v7}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_11
    .catch Ljava/io/FileNotFoundException; {:try_start_11 .. :try_end_11} :catch_2

    .line 280
    .line 281
    .line 282
    :goto_a
    move-object v3, v0

    .line 283
    goto :goto_f

    .line 284
    :goto_b
    :try_start_12
    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 285
    :catchall_6
    move-exception v0

    .line 286
    :try_start_13
    invoke-static {v8, v2}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    throw v0
    :try_end_13
    .catch Ljava/io/FileNotFoundException; {:try_start_13 .. :try_end_13} :catch_2

    .line 290
    :catch_2
    iget-object v0, v6, Lk92;->a:Ljava/io/File;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_f

    .line 297
    .line 298
    :try_start_14
    new-instance v2, Ljava/io/FileInputStream;

    .line 299
    .line 300
    iget-object v0, v6, Lk92;->a:Ljava/io/File;

    .line 301
    .line 302
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3

    .line 303
    .line 304
    .line 305
    :try_start_15
    iput-object v2, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 306
    .line 307
    iput-byte v5, v1, Lcb1;->h0:B

    .line 308
    .line 309
    invoke-static {v2}, Lqe4;->K0(Ljava/io/FileInputStream;)Lo05;

    .line 310
    .line 311
    .line 312
    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 313
    if-ne v0, v3, :cond_d

    .line 314
    .line 315
    goto :goto_f

    .line 316
    :cond_d
    move-object v1, v2

    .line 317
    :goto_c
    :try_start_16
    invoke-static {v1, v7}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_3

    .line 318
    .line 319
    .line 320
    goto :goto_a

    .line 321
    :catch_3
    move-exception v0

    .line 322
    goto :goto_e

    .line 323
    :catchall_7
    move-exception v0

    .line 324
    goto :goto_8

    .line 325
    :goto_d
    :try_start_17
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 326
    :catchall_8
    move-exception v0

    .line 327
    :try_start_18
    invoke-static {v2, v1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 328
    .line 329
    .line 330
    throw v0
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_3

    .line 331
    :goto_e
    instance-of v1, v0, Ljava/io/FileNotFoundException;

    .line 332
    .line 333
    if-eqz v1, :cond_e

    .line 334
    .line 335
    iget-object v1, v6, Lk92;->a:Ljava/io/File;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v0, Ljava/io/FileNotFoundException;

    .line 342
    .line 343
    invoke-static {v1, v0}, Los4;->W(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    :cond_e
    throw v0

    .line 348
    :cond_f
    new-instance v0, Lo05;

    .line 349
    .line 350
    invoke-direct {v0, v4}, Lo05;-><init>(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_a

    .line 354
    :goto_f
    return-object v3

    .line 355
    :pswitch_1
    check-cast v6, Lib1;

    .line 356
    .line 357
    iget-byte v0, v1, Lcb1;->h0:B

    .line 358
    .line 359
    if-eqz v0, :cond_12

    .line 360
    .line 361
    if-eq v0, v4, :cond_11

    .line 362
    .line 363
    if-ne v0, v5, :cond_10

    .line 364
    .line 365
    iget-object v0, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Ljava/lang/Throwable;

    .line 368
    .line 369
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    move-object/from16 v1, p1

    .line 373
    .line 374
    goto :goto_12

    .line 375
    :cond_10
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    move-object v3, v7

    .line 379
    goto :goto_14

    .line 380
    :cond_11
    :try_start_19
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 381
    .line 382
    .line 383
    move-object/from16 v0, p1

    .line 384
    .line 385
    goto :goto_10

    .line 386
    :catchall_9
    move-exception v0

    .line 387
    goto :goto_11

    .line 388
    :cond_12
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    :try_start_1a
    iput-byte v4, v1, Lcb1;->h0:B

    .line 392
    .line 393
    invoke-virtual {v6, v4, v1}, Lib1;->g(ZLs51;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-ne v0, v3, :cond_13

    .line 398
    .line 399
    goto :goto_14

    .line 400
    :cond_13
    :goto_10
    check-cast v0, Lhh7;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    .line 401
    .line 402
    goto :goto_13

    .line 403
    :goto_11
    invoke-virtual {v6}, Lib1;->b()Lja7;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    iput-object v0, v1, Lcb1;->i0:Ljava/lang/Object;

    .line 408
    .line 409
    iput-byte v5, v1, Lcb1;->h0:B

    .line 410
    .line 411
    invoke-virtual {v2}, Lja7;->a()Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    if-ne v1, v3, :cond_14

    .line 416
    .line 417
    goto :goto_14

    .line 418
    :cond_14
    :goto_12
    check-cast v1, Ljava/lang/Number;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    new-instance v2, Lu66;

    .line 425
    .line 426
    invoke-direct {v2, v0, v1}, Lu66;-><init>(Ljava/lang/Throwable;I)V

    .line 427
    .line 428
    .line 429
    move-object v0, v2

    .line 430
    :goto_13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 431
    .line 432
    new-instance v3, Lqg5;

    .line 433
    .line 434
    invoke-direct {v3, v0, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :goto_14
    return-object v3

    .line 438
    nop

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
