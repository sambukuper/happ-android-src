.class public final Loo0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;Lc19;Lxd6;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Loo0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Loo0;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Loo0;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Loo0;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Loo0;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, Loo0;->X:B

    iput-object p1, p0, Loo0;->g0:Ljava/lang/Object;

    iput-object p2, p0, Loo0;->Y:Ljava/lang/Object;

    iput-object p3, p0, Loo0;->Z:Ljava/lang/Object;

    iput-object p4, p0, Loo0;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, Loo0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loo0;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Loo0;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lc19;

    .line 13
    .line 14
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lxd6;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Ly09;->i(Landroid/view/View;Lc19;Lxd6;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Loo0;->g0:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Loo0;->Y:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lwy7;

    .line 32
    .line 33
    iget-object v0, v0, Lwy7;->Y:Lif6;

    .line 34
    .line 35
    invoke-virtual {v0}, Lu2;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ldc4;

    .line 40
    .line 41
    new-instance v1, Llh5;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Llh5;-><init>(Ldc4;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lw79;->K(Landroid/os/Parcelable;)[B

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Loo0;->Z:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lr43;

    .line 53
    .line 54
    invoke-static {v1, v0}, Lvb4;->b(Lr43;[B)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Loo0;->g0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lhc4;

    .line 60
    .line 61
    iget-object v0, v0, Lhc4;->l:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter v0

    .line 64
    :try_start_1
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lhc4;

    .line 67
    .line 68
    iget-object v1, v1, Lhc4;->m:Ljava/util/HashMap;

    .line 69
    .line 70
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lhc4;

    .line 80
    .line 81
    iget-object v1, v1, Lhc4;->n:Ljava/util/HashMap;

    .line 82
    .line 83
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lhc4;

    .line 93
    .line 94
    iget-object v1, v1, Lhc4;->o:Ljava/util/HashMap;

    .line 95
    .line 96
    iget-object p0, p0, Loo0;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    monitor-exit v0

    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :catchall_0
    move-exception p0

    .line 107
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw p0

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :catch_0
    move-exception v0

    .line 113
    goto :goto_0

    .line 114
    :catch_1
    move-exception v0

    .line 115
    goto :goto_1

    .line 116
    :catch_2
    move-exception v0

    .line 117
    goto :goto_1

    .line 118
    :goto_0
    :try_start_2
    invoke-static {}, Llh4;->P0()Llh4;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v2, Lhc4;->p:[B

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Loo0;->Z:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Lr43;

    .line 130
    .line 131
    invoke-static {v1, v0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Loo0;->g0:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lhc4;

    .line 137
    .line 138
    iget-object v0, v0, Lhc4;->l:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter v0

    .line 141
    :try_start_3
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lhc4;

    .line 144
    .line 145
    iget-object v1, v1, Lhc4;->m:Ljava/util/HashMap;

    .line 146
    .line 147
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Lhc4;

    .line 157
    .line 158
    iget-object v1, v1, Lhc4;->n:Ljava/util/HashMap;

    .line 159
    .line 160
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Lhc4;

    .line 170
    .line 171
    iget-object v1, v1, Lhc4;->o:Ljava/util/HashMap;

    .line 172
    .line 173
    iget-object p0, p0, Loo0;->f0:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    monitor-exit v0

    .line 181
    goto :goto_2

    .line 182
    :catchall_2
    move-exception p0

    .line 183
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 184
    throw p0

    .line 185
    :goto_1
    :try_start_4
    iget-object v1, p0, Loo0;->Z:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v1, Lr43;

    .line 188
    .line 189
    invoke-static {v1, v0}, Lvb4;->a(Lr43;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Loo0;->g0:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lhc4;

    .line 195
    .line 196
    iget-object v0, v0, Lhc4;->l:Ljava/lang/Object;

    .line 197
    .line 198
    monitor-enter v0

    .line 199
    :try_start_5
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Lhc4;

    .line 202
    .line 203
    iget-object v1, v1, Lhc4;->m:Ljava/util/HashMap;

    .line 204
    .line 205
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v1, Lhc4;

    .line 215
    .line 216
    iget-object v1, v1, Lhc4;->n:Ljava/util/HashMap;

    .line 217
    .line 218
    iget-object v2, p0, Loo0;->f0:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v2, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v1, Lhc4;

    .line 228
    .line 229
    iget-object v1, v1, Lhc4;->o:Ljava/util/HashMap;

    .line 230
    .line 231
    iget-object p0, p0, Loo0;->f0:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p0, Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    monitor-exit v0

    .line 239
    :goto_2
    return-void

    .line 240
    :catchall_3
    move-exception p0

    .line 241
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 242
    throw p0

    .line 243
    :goto_3
    iget-object v1, p0, Loo0;->g0:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v1, Lhc4;

    .line 246
    .line 247
    iget-object v1, v1, Lhc4;->l:Ljava/lang/Object;

    .line 248
    .line 249
    monitor-enter v1

    .line 250
    :try_start_6
    iget-object v2, p0, Loo0;->g0:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v2, Lhc4;

    .line 253
    .line 254
    iget-object v2, v2, Lhc4;->m:Ljava/util/HashMap;

    .line 255
    .line 256
    iget-object v3, p0, Loo0;->f0:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v3, Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    iget-object v2, p0, Loo0;->g0:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v2, Lhc4;

    .line 266
    .line 267
    iget-object v2, v2, Lhc4;->n:Ljava/util/HashMap;

    .line 268
    .line 269
    iget-object v3, p0, Loo0;->f0:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v3, Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    iget-object v2, p0, Loo0;->g0:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, Lhc4;

    .line 279
    .line 280
    iget-object v2, v2, Lhc4;->o:Ljava/util/HashMap;

    .line 281
    .line 282
    iget-object p0, p0, Loo0;->f0:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 290
    throw v0

    .line 291
    :catchall_4
    move-exception p0

    .line 292
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 293
    throw p0

    .line 294
    :pswitch_1
    iget-object v0, p0, Loo0;->g0:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Lyr2;

    .line 297
    .line 298
    iget-object v0, v0, Lyr2;->Y:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Lqo0;

    .line 301
    .line 302
    iget-object v1, p0, Loo0;->Z:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Lst4;

    .line 305
    .line 306
    iget-object v2, p0, Loo0;->Y:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v2, Lpo0;

    .line 309
    .line 310
    if-eqz v2, :cond_0

    .line 311
    .line 312
    const/4 v3, 0x1

    .line 313
    iput-boolean v3, v0, Lqo0;->C0:Z

    .line 314
    .line 315
    iget-object v2, v2, Lpo0;->b:Lnt4;

    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-virtual {v2, v3}, Lnt4;->c(Z)V

    .line 319
    .line 320
    .line 321
    iput-boolean v3, v0, Lqo0;->C0:Z

    .line 322
    .line 323
    :cond_0
    invoke-virtual {v1}, Lst4;->isEnabled()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_1

    .line 328
    .line 329
    invoke-virtual {v1}, Lst4;->hasSubMenu()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_1

    .line 334
    .line 335
    iget-object p0, p0, Loo0;->f0:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p0, Lnt4;

    .line 338
    .line 339
    const/4 v0, 0x4

    .line 340
    const/4 v2, 0x0

    .line 341
    invoke-virtual {p0, v1, v2, v0}, Lnt4;->q(Landroid/view/MenuItem;Liu4;I)Z

    .line 342
    .line 343
    .line 344
    :cond_1
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
