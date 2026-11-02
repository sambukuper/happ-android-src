.class public final Lao;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Ljava/lang/String;

.field public h0:Lqo;

.field public i0:Ljava/lang/String;

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:B

.field public synthetic n0:Ljava/lang/Object;

.field public final synthetic o0:Ljava/lang/String;

.field public final synthetic p0:Lqo;

.field public final synthetic q0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lao;->o0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lao;->p0:Lqo;

    .line 4
    .line 5
    iput-object p3, p0, Lao;->q0:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lze2;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lao;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lao;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lao;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lao;

    .line 2
    .line 3
    iget-object v1, p0, Lao;->p0:Lqo;

    .line 4
    .line 5
    iget-object v2, p0, Lao;->q0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lao;->o0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lao;-><init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, v0, Lao;->n0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lao;->n0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lze2;

    .line 6
    .line 7
    iget-byte v2, v1, Lao;->m0:B

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    sget-object v6, Lc71;->X:Lc71;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget v2, v1, Lao;->k0:I

    .line 21
    .line 22
    iget v7, v1, Lao;->j0:I

    .line 23
    .line 24
    iget-object v8, v1, Lao;->i0:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v9, v1, Lao;->h0:Lqo;

    .line 27
    .line 28
    iget-object v10, v1, Lao;->g0:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v16, v10

    .line 34
    .line 35
    move-object v10, v9

    .line 36
    move-object/from16 v9, v16

    .line 37
    .line 38
    move-object/from16 v16, v8

    .line 39
    .line 40
    move v8, v7

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    return-object v0

    .line 50
    :cond_1
    iget v2, v1, Lao;->l0:I

    .line 51
    .line 52
    iget v7, v1, Lao;->k0:I

    .line 53
    .line 54
    iget v8, v1, Lao;->j0:I

    .line 55
    .line 56
    iget-object v9, v1, Lao;->i0:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v10, v1, Lao;->h0:Lqo;

    .line 59
    .line 60
    iget-object v11, v1, Lao;->g0:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move/from16 v20, v7

    .line 66
    .line 67
    move v7, v2

    .line 68
    move/from16 v2, v20

    .line 69
    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_2
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/16 v2, 0x1e

    .line 76
    .line 77
    iget-object v7, v1, Lao;->o0:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v8, v1, Lao;->p0:Lqo;

    .line 80
    .line 81
    iget-object v9, v1, Lao;->q0:Ljava/lang/String;

    .line 82
    .line 83
    move-object v10, v8

    .line 84
    move-object/from16 v16, v9

    .line 85
    .line 86
    move v8, v2

    .line 87
    move-object v9, v7

    .line 88
    move v7, v3

    .line 89
    :goto_0
    move-object v2, v0

    .line 90
    if-ge v7, v8, :cond_7

    .line 91
    .line 92
    const-string v0, "https://ntp2-sync.com/v1install?id="

    .line 93
    .line 94
    invoke-static {v0, v9}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v13, Lun;->Z:Lun;

    .line 99
    .line 100
    const-string v18, "close"

    .line 101
    .line 102
    :try_start_0
    sget-object v11, Lss8;->a:Lss8;

    .line 103
    .line 104
    iget-object v11, v10, Lqo;->a:Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {v11}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    iget-object v12, v11, Lyf8;->X:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v12, Lsu/happ/proxyutility/dto/HWID;

    .line 113
    .line 114
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    iget-object v14, v11, Lyf8;->Y:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v14, Lsu/happ/proxyutility/dto/VersionOS;

    .line 121
    .line 122
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    iget-object v11, v11, Lyf8;->Z:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v11, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 129
    .line 130
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    const/16 v11, 0x2328

    .line 135
    .line 136
    invoke-virtual {v10, v11, v5, v3}, Lqo;->b(IZZ)Lokhttp3/OkHttpClient;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    move-object/from16 v17, v11

    .line 141
    .line 142
    new-instance v11, Ljava/net/URL;

    .line 143
    .line 144
    invoke-direct {v11, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v0, v17

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    const/16 v19, 0x0

    .line 152
    .line 153
    invoke-virtual/range {v10 .. v19}, Lqo;->a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 157
    move-object/from16 v12, v16

    .line 158
    .line 159
    :try_start_1
    invoke-virtual {v11}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-virtual {v0, v11}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {v11}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {}, Lss8;->t()Z

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    new-instance v13, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-direct {v13, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 189
    .line 190
    .line 191
    sget-object v0, Lyw2;->b:Lcom/google/gson/a;

    .line 192
    .line 193
    const-class v14, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v15, Lyi8;

    .line 199
    .line 200
    invoke-direct {v15, v14}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v11, v15}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_3

    .line 208
    .line 209
    new-instance v11, Lqg5;

    .line 210
    .line 211
    invoke-direct {v11, v13, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_3
    const-string v0, "Required value was null."

    .line 216
    .line 217
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 218
    .line 219
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 223
    :catchall_0
    move-exception v0

    .line 224
    goto :goto_1

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    move-object/from16 v12, v16

    .line 227
    .line 228
    :goto_1
    instance-of v11, v0, Ljava/lang/InterruptedException;

    .line 229
    .line 230
    if-nez v11, :cond_6

    .line 231
    .line 232
    instance-of v11, v0, Ljava/util/concurrent/CancellationException;

    .line 233
    .line 234
    if-nez v11, :cond_6

    .line 235
    .line 236
    new-instance v11, Lrj6;

    .line 237
    .line 238
    invoke-direct {v11, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    :goto_2
    new-instance v0, Lsj6;

    .line 242
    .line 243
    invoke-direct {v0, v11}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iput-object v2, v1, Lao;->n0:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v9, v1, Lao;->g0:Ljava/lang/String;

    .line 249
    .line 250
    iput-object v10, v1, Lao;->h0:Lqo;

    .line 251
    .line 252
    iput-object v12, v1, Lao;->i0:Ljava/lang/String;

    .line 253
    .line 254
    iput v8, v1, Lao;->j0:I

    .line 255
    .line 256
    iput v7, v1, Lao;->k0:I

    .line 257
    .line 258
    iput v7, v1, Lao;->l0:I

    .line 259
    .line 260
    iput-byte v5, v1, Lao;->m0:B

    .line 261
    .line 262
    invoke-interface {v2, v0, v1}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v0, v6, :cond_4

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_4
    move-object v0, v2

    .line 270
    move v2, v7

    .line 271
    move-object v11, v9

    .line 272
    move-object v9, v12

    .line 273
    :goto_3
    sget-object v12, Lgx1;->Y:Lbe;

    .line 274
    .line 275
    const-wide/16 v12, 0x3a98

    .line 276
    .line 277
    sget-object v14, Llx1;->Z:Llx1;

    .line 278
    .line 279
    invoke-static {v12, v13, v14}, Lvj8;->m0(JLlx1;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v12

    .line 283
    iput-object v0, v1, Lao;->n0:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v11, v1, Lao;->g0:Ljava/lang/String;

    .line 286
    .line 287
    iput-object v10, v1, Lao;->h0:Lqo;

    .line 288
    .line 289
    iput-object v9, v1, Lao;->i0:Ljava/lang/String;

    .line 290
    .line 291
    iput v8, v1, Lao;->j0:I

    .line 292
    .line 293
    iput v2, v1, Lao;->k0:I

    .line 294
    .line 295
    iput v7, v1, Lao;->l0:I

    .line 296
    .line 297
    iput-byte v4, v1, Lao;->m0:B

    .line 298
    .line 299
    invoke-static {v12, v13, v1}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    if-ne v7, v6, :cond_5

    .line 304
    .line 305
    :goto_4
    return-object v6

    .line 306
    :cond_5
    move-object/from16 v16, v9

    .line 307
    .line 308
    move-object v9, v11

    .line 309
    :goto_5
    add-int/lit8 v7, v2, 0x1

    .line 310
    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_6
    throw v0

    .line 314
    :cond_7
    sget-object v0, Ldn8;->a:Ldn8;

    .line 315
    .line 316
    return-object v0
.end method
