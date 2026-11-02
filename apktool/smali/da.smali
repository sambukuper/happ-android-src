.class public final Lda;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lda;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lda;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lda;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lda;->g0:B

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
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lda;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lda;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lda;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lda;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_3
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lda;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_4
    invoke-virtual {p0, p1}, Lda;->m(Lq51;)Lq51;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lda;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lda;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Lq51;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Lda;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lda;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lda;->j0:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Lda;

    .line 11
    .line 12
    check-cast p0, Lwq8;

    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    const/4 v2, 0x5

    .line 17
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Lda;

    .line 22
    .line 23
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, Lda;

    .line 33
    .line 34
    check-cast p0, Li30;

    .line 35
    .line 36
    check-cast v1, Lh30;

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_2
    new-instance v0, Lda;

    .line 44
    .line 45
    check-cast p0, Lch;

    .line 46
    .line 47
    check-cast v1, Lh38;

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_3
    new-instance v0, Lda;

    .line 55
    .line 56
    check-cast p0, Lla;

    .line 57
    .line 58
    check-cast v1, Lsn2;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_4
    new-instance v0, Lda;

    .line 66
    .line 67
    check-cast p0, Lt5;

    .line 68
    .line 69
    check-cast v1, Lsn2;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v0, p0, v1, p1, v2}, Lda;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lda;->g0:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Ldn8;->a:Ldn8;

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v6, Lc71;->X:Lc71;

    .line 12
    .line 13
    iget-object v7, v0, Lda;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, Lda;->j0:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x0

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v8, Lwq8;

    .line 23
    .line 24
    iget-object v1, v8, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    check-cast v7, Ljava/util/List;

    .line 27
    .line 28
    iget-boolean v2, v0, Lda;->h0:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    if-ne v2, v9, :cond_0

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v10

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "CXCP"

    .line 50
    .line 51
    invoke-static {v2}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sget-object v4, Lpq8;->Y:Lpq8;

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    new-instance v2, Lsq8;

    .line 72
    .line 73
    const/16 v5, 0xf

    .line 74
    .line 75
    invoke-direct {v2, v10, v10, v10, v5}, Lsq8;-><init>(Lfg0;Ljava/util/LinkedHashMap;Lwe6;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_3
    check-cast v2, Lsq8;

    .line 82
    .line 83
    new-instance v5, Lfg0;

    .line 84
    .line 85
    invoke-direct {v5, v3}, Lfg0;-><init>(B)V

    .line 86
    .line 87
    .line 88
    iget-object v3, v2, Lsq8;->a:Lfg0;

    .line 89
    .line 90
    iget-object v3, v3, Lfg0;->Y:Lk05;

    .line 91
    .line 92
    invoke-virtual {v5, v3}, Lfg0;->c(Ll11;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_4

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 110
    .line 111
    invoke-static {v7}, Lw45;->B(Landroid/hardware/camera2/CaptureRequest$Key;)Lzx;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    iget-object v11, v5, Lfg0;->Y:Lk05;

    .line 116
    .line 117
    invoke-virtual {v11, v7}, Lk05;->w(Lzx;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    iget-object v3, v2, Lsq8;->b:Ljava/util/Map;

    .line 122
    .line 123
    invoke-static {v3}, Lzp4;->S(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget-object v7, v2, Lsq8;->c:Ljava/util/Set;

    .line 128
    .line 129
    check-cast v7, Ljava/lang/Iterable;

    .line 130
    .line 131
    invoke-static {v7}, Lwv0;->b1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-object v2, v2, Lsq8;->d:Lwe6;

    .line 136
    .line 137
    new-instance v11, Lsq8;

    .line 138
    .line 139
    invoke-direct {v11, v5, v3, v7, v2}, Lsq8;-><init>(Lfg0;Ljava/util/Map;Ljava/util/Set;Lwe6;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, v4, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    iget-object v1, v8, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-static {v1}, Lwq8;->j(Ljava/util/LinkedHashMap;)Lsq8;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iput-boolean v9, v0, Lda;->h0:Z

    .line 152
    .line 153
    invoke-virtual {v8, v1, v10, v0}, Lwq8;->m(Lsq8;Ljava/util/LinkedHashSet;Ls51;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-ne v0, v6, :cond_5

    .line 158
    .line 159
    move-object v0, v6

    .line 160
    :cond_5
    :goto_1
    return-object v0

    .line 161
    :pswitch_0
    check-cast v8, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 162
    .line 163
    iget-boolean v1, v0, Lda;->h0:Z

    .line 164
    .line 165
    if-eqz v1, :cond_7

    .line 166
    .line 167
    if-ne v1, v9, :cond_6

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object v4, v10

    .line 177
    goto :goto_3

    .line 178
    :cond_7
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    check-cast v7, Ljava/lang/String;

    .line 182
    .line 183
    const/4 v1, 0x6

    .line 184
    invoke-static {v8, v7, v10, v3, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->y(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 185
    .line 186
    .line 187
    iput-boolean v9, v0, Lda;->h0:Z

    .line 188
    .line 189
    invoke-virtual {v8, v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->I(Luy7;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-ne v0, v6, :cond_8

    .line 194
    .line 195
    move-object v4, v6

    .line 196
    goto :goto_3

    .line 197
    :cond_8
    :goto_2
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object v1, v8, Lsu/happ/proxyutility/feature/main/MainViewModel;->w:Loh7;

    .line 201
    .line 202
    :cond_9
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v10, v0

    .line 207
    check-cast v10, Lxm4;

    .line 208
    .line 209
    iget v2, v10, Lxm4;->f:I

    .line 210
    .line 211
    add-int/lit8 v17, v2, 0x1

    .line 212
    .line 213
    const/16 v27, 0x0

    .line 214
    .line 215
    const v28, 0xffdf

    .line 216
    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    const-wide/16 v12, 0x0

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/16 v23, 0x0

    .line 236
    .line 237
    const/16 v24, 0x0

    .line 238
    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    const/16 v26, 0x0

    .line 242
    .line 243
    invoke-static/range {v10 .. v28}, Lxm4;->a(Lxm4;Ljava/lang/String;JLsu/happ/proxyutility/dto/ServerConfig;Lb83;ZIILa45;Ljava/lang/Integer;ZLwm4;ZLpm4;ZZLtm4;I)Lxm4;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v1, v0, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_9

    .line 252
    .line 253
    :goto_3
    return-object v4

    .line 254
    :pswitch_1
    check-cast v7, Lh30;

    .line 255
    .line 256
    check-cast v8, Li30;

    .line 257
    .line 258
    iget-object v1, v8, Li30;->c:Lrh5;

    .line 259
    .line 260
    iget-boolean v2, v0, Lda;->h0:Z

    .line 261
    .line 262
    if-eqz v2, :cond_b

    .line 263
    .line 264
    if-ne v2, v9, :cond_a

    .line 265
    .line 266
    :try_start_0
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :catchall_0
    move-exception v0

    .line 271
    goto :goto_7

    .line 272
    :cond_a
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    move-object v4, v10

    .line 276
    goto :goto_6

    .line 277
    :cond_b
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :try_start_1
    invoke-virtual {v1, v7}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iput-boolean v9, v0, Lda;->h0:Z

    .line 284
    .line 285
    iget-object v2, v7, Lh30;->b:Lx90;

    .line 286
    .line 287
    invoke-virtual {v2, v0}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    if-ne v0, v6, :cond_c

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_c
    move-object v0, v4

    .line 295
    :goto_4
    if-ne v0, v6, :cond_d

    .line 296
    .line 297
    move-object v4, v6

    .line 298
    goto :goto_6

    .line 299
    :cond_d
    :goto_5
    invoke-virtual {v1, v10}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :goto_6
    return-object v4

    .line 303
    :goto_7
    invoke-virtual {v1, v10}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :pswitch_2
    check-cast v8, Lch;

    .line 308
    .line 309
    iget-object v1, v8, Lch;->e:Lxd7;

    .line 310
    .line 311
    iget-object v2, v8, Lch;->a:Landroid/view/View;

    .line 312
    .line 313
    iget-boolean v11, v0, Lda;->h0:Z

    .line 314
    .line 315
    const/4 v12, 0x4

    .line 316
    if-eqz v11, :cond_f

    .line 317
    .line 318
    if-ne v11, v9, :cond_e

    .line 319
    .line 320
    :try_start_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 321
    .line 322
    .line 323
    goto/16 :goto_c

    .line 324
    .line 325
    :catchall_1
    move-exception v0

    .line 326
    goto/16 :goto_10

    .line 327
    .line 328
    :cond_e
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    move-object v4, v10

    .line 332
    goto/16 :goto_f

    .line 333
    .line 334
    :cond_f
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    new-instance v5, Lbh;

    .line 338
    .line 339
    invoke-direct {v5}, Lbh;-><init>()V

    .line 340
    .line 341
    .line 342
    check-cast v7, Lh38;

    .line 343
    .line 344
    new-instance v11, Lah;

    .line 345
    .line 346
    new-instance v13, Lyg;

    .line 347
    .line 348
    invoke-direct {v13, v8, v7, v3}, Lyg;-><init>(Lch;Lh38;B)V

    .line 349
    .line 350
    .line 351
    new-instance v3, Lyg;

    .line 352
    .line 353
    invoke-direct {v3, v8, v7, v9}, Lyg;-><init>(Lch;Lh38;B)V

    .line 354
    .line 355
    .line 356
    invoke-direct {v11, v5, v13, v3, v2}, Lah;-><init>(Lbh;Lyg;Lyg;Landroid/view/View;)V

    .line 357
    .line 358
    .line 359
    iget-object v3, v8, Lch;->b:Lgn2;

    .line 360
    .line 361
    if-eqz v3, :cond_11

    .line 362
    .line 363
    invoke-interface {v3, v11}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Lah;

    .line 368
    .line 369
    if-nez v3, :cond_10

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_10
    move-object v11, v3

    .line 373
    :cond_11
    :goto_8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    if-eqz v7, :cond_12

    .line 382
    .line 383
    invoke-virtual {v7}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    goto :goto_9

    .line 388
    :cond_12
    move-object v7, v10

    .line 389
    :goto_9
    if-eq v3, v7, :cond_14

    .line 390
    .line 391
    iget-object v3, v8, Lch;->i:Lj0;

    .line 392
    .line 393
    if-nez v3, :cond_13

    .line 394
    .line 395
    new-instance v3, Lj0;

    .line 396
    .line 397
    invoke-direct {v3, v8, v11, v5, v9}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 398
    .line 399
    .line 400
    iput-object v3, v8, Lch;->i:Lj0;

    .line 401
    .line 402
    :cond_13
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_14
    new-instance v3, Lve2;

    .line 407
    .line 408
    invoke-direct {v3, v11}, Lve2;-><init>(Lah;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v3, v9}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    if-nez v3, :cond_15

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_15
    iput-object v3, v8, Lch;->h:Landroid/view/ActionMode;

    .line 419
    .line 420
    :goto_a
    :try_start_3
    iput-boolean v9, v0, Lda;->h0:Z

    .line 421
    .line 422
    iget-object v3, v5, Lbh;->a:Lx90;

    .line 423
    .line 424
    invoke-virtual {v3, v0}, Lx90;->r(Lq51;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 428
    if-ne v0, v6, :cond_16

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_16
    move-object v0, v4

    .line 432
    :goto_b
    if-ne v0, v6, :cond_17

    .line 433
    .line 434
    move-object v4, v6

    .line 435
    goto :goto_f

    .line 436
    :cond_17
    :goto_c
    invoke-virtual {v1}, Lxd7;->a()V

    .line 437
    .line 438
    .line 439
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    if-eqz v1, :cond_18

    .line 448
    .line 449
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    goto :goto_d

    .line 454
    :cond_18
    move-object v1, v10

    .line 455
    :goto_d
    if-eq v0, v1, :cond_1a

    .line 456
    .line 457
    iget-object v0, v8, Lch;->j:Ljava/lang/Runnable;

    .line 458
    .line 459
    if-nez v0, :cond_19

    .line 460
    .line 461
    new-instance v0, Lc1;

    .line 462
    .line 463
    invoke-direct {v0, v8, v12}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 464
    .line 465
    .line 466
    iput-object v0, v8, Lch;->j:Ljava/lang/Runnable;

    .line 467
    .line 468
    :cond_19
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 469
    .line 470
    .line 471
    goto :goto_e

    .line 472
    :cond_1a
    iget-object v0, v8, Lch;->h:Landroid/view/ActionMode;

    .line 473
    .line 474
    if-eqz v0, :cond_1b

    .line 475
    .line 476
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 477
    .line 478
    .line 479
    :cond_1b
    :goto_e
    iget-object v0, v8, Lch;->i:Lj0;

    .line 480
    .line 481
    if-eqz v0, :cond_1c

    .line 482
    .line 483
    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 484
    .line 485
    .line 486
    :cond_1c
    iput-object v10, v8, Lch;->h:Landroid/view/ActionMode;

    .line 487
    .line 488
    :goto_f
    return-object v4

    .line 489
    :goto_10
    invoke-virtual {v1}, Lxd7;->a()V

    .line 490
    .line 491
    .line 492
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    if-eqz v3, :cond_1d

    .line 501
    .line 502
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    goto :goto_11

    .line 507
    :cond_1d
    move-object v3, v10

    .line 508
    :goto_11
    if-eq v1, v3, :cond_1f

    .line 509
    .line 510
    iget-object v1, v8, Lch;->j:Ljava/lang/Runnable;

    .line 511
    .line 512
    if-nez v1, :cond_1e

    .line 513
    .line 514
    new-instance v1, Lc1;

    .line 515
    .line 516
    invoke-direct {v1, v8, v12}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 517
    .line 518
    .line 519
    iput-object v1, v8, Lch;->j:Ljava/lang/Runnable;

    .line 520
    .line 521
    :cond_1e
    invoke-virtual {v2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 522
    .line 523
    .line 524
    goto :goto_12

    .line 525
    :cond_1f
    iget-object v1, v8, Lch;->h:Landroid/view/ActionMode;

    .line 526
    .line 527
    if-eqz v1, :cond_20

    .line 528
    .line 529
    invoke-virtual {v1}, Landroid/view/ActionMode;->finish()V

    .line 530
    .line 531
    .line 532
    :cond_20
    :goto_12
    iget-object v1, v8, Lch;->i:Lj0;

    .line 533
    .line 534
    if-eqz v1, :cond_21

    .line 535
    .line 536
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 537
    .line 538
    .line 539
    :cond_21
    iput-object v10, v8, Lch;->h:Landroid/view/ActionMode;

    .line 540
    .line 541
    throw v0

    .line 542
    :pswitch_3
    check-cast v8, Lla;

    .line 543
    .line 544
    iget-boolean v1, v0, Lda;->h0:Z

    .line 545
    .line 546
    if-eqz v1, :cond_23

    .line 547
    .line 548
    if-ne v1, v9, :cond_22

    .line 549
    .line 550
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    goto :goto_13

    .line 554
    :cond_22
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    move-object v4, v10

    .line 558
    goto :goto_14

    .line 559
    :cond_23
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    new-instance v1, Lba;

    .line 563
    .line 564
    invoke-direct {v1, v8, v9}, Lba;-><init>(Lla;B)V

    .line 565
    .line 566
    .line 567
    new-instance v3, Lr0;

    .line 568
    .line 569
    check-cast v7, Lsn2;

    .line 570
    .line 571
    invoke-direct {v3, v7, v8, v10, v2}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 572
    .line 573
    .line 574
    iput-boolean v9, v0, Lda;->h0:Z

    .line 575
    .line 576
    invoke-static {v1, v3, v0}, Lt9;->b(Ldn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-ne v0, v6, :cond_24

    .line 581
    .line 582
    move-object v4, v6

    .line 583
    goto :goto_14

    .line 584
    :cond_24
    :goto_13
    invoke-virtual {v8}, Lla;->b()Lke1;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    iget-object v1, v8, Lla;->f:Lnh5;

    .line 589
    .line 590
    invoke-virtual {v1}, Lnh5;->l()F

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    invoke-virtual {v0, v2}, Lke1;->a(F)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_25

    .line 599
    .line 600
    invoke-virtual {v8}, Lla;->b()Lke1;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v2, v0}, Lke1;->c(Ljava/lang/Object;)F

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-virtual {v1}, Lnh5;->l()F

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    sub-float/2addr v1, v2

    .line 613
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    const/high16 v2, 0x3f000000    # 0.5f

    .line 618
    .line 619
    cmpg-float v1, v1, v2

    .line 620
    .line 621
    if-gez v1, :cond_25

    .line 622
    .line 623
    iget-object v1, v8, Lla;->d:Lrh5;

    .line 624
    .line 625
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    iget-object v1, v8, Lla;->c:Lrh5;

    .line 629
    .line 630
    invoke-virtual {v1, v0}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    :cond_25
    :goto_14
    return-object v4

    .line 634
    :pswitch_4
    iget-boolean v1, v0, Lda;->h0:Z

    .line 635
    .line 636
    if-eqz v1, :cond_27

    .line 637
    .line 638
    if-ne v1, v9, :cond_26

    .line 639
    .line 640
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    goto :goto_15

    .line 644
    :cond_26
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    move-object v4, v10

    .line 648
    goto :goto_15

    .line 649
    :cond_27
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    check-cast v8, Lt5;

    .line 653
    .line 654
    new-instance v1, Laa;

    .line 655
    .line 656
    invoke-direct {v1, v8, v2}, Laa;-><init>(Lt5;B)V

    .line 657
    .line 658
    .line 659
    new-instance v2, Lr0;

    .line 660
    .line 661
    check-cast v7, Lsn2;

    .line 662
    .line 663
    invoke-direct {v2, v7, v8, v10, v9}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 664
    .line 665
    .line 666
    iput-boolean v9, v0, Lda;->h0:Z

    .line 667
    .line 668
    invoke-static {v1, v2, v0}, Lys0;->T(Ldn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    if-ne v0, v6, :cond_28

    .line 673
    .line 674
    move-object v4, v6

    .line 675
    :cond_28
    :goto_15
    return-object v4

    .line 676
    nop

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
