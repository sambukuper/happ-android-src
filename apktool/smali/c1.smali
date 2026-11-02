.class public final synthetic Lc1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lc1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lc1;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    iget-object p0, p0, Lc1;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lr53;

    .line 4
    .line 5
    iget-object v0, p0, Lr53;->y0:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iput-object v1, p0, Lr53;->A0:Lq53;

    .line 10
    .line 11
    iget-object v2, p0, Lr53;->z0:Ln63;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Lr53;->z0:Ln63;

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lr53;->e(Ln63;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method

.method private final b()V
    .locals 4

    .line 1
    iget-object p0, p0, Lc1;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld6;

    .line 4
    .line 5
    iget-object v0, p0, Ld6;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lzl0;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const-string v0, "CX:unbindAll"

    .line 12
    .line 13
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {}, Ls08;->b()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Ld6;->e(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ld6;->j0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lt84;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Ld6;->f0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lt84;->j(Ljava/util/HashSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Ld6;->j0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lt84;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Ld6;->f0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ljava/util/HashSet;

    .line 50
    .line 51
    iget-object v1, v0, Lt84;->a:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v1

    .line 54
    :try_start_1
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lsy;

    .line 69
    .line 70
    iget-object v3, v0, Lt84;->b:Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    iget-object v3, v0, Lt84;->b:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lp84;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lt84;->k(Lp84;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    monitor-exit v1

    .line 93
    return-void

    .line 94
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    throw p0

    .line 96
    :catchall_1
    move-exception p0

    .line 97
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_2
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lc1;->X:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;

    .line 15
    .line 16
    sget-object v1, Landroidx/work/multiprocess/RemoteWorkManagerClient;->j:Lkp5;

    .line 17
    .line 18
    iget-object v1, v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->i:Lrd6;

    .line 19
    .line 20
    iget-object v2, v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->h:Lyr2;

    .line 21
    .line 22
    iget v0, v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->g:I

    .line 23
    .line 24
    int-to-long v3, v0

    .line 25
    iget-object v0, v2, Lyr2;->Y:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 36
    .line 37
    iget-object v1, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->h0:Lg94;

    .line 38
    .line 39
    iget v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->Y:I

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    iput-boolean v5, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->Z:Z

    .line 44
    .line 45
    sget-object v2, Ln84;->ON_PAUSE:Ln84;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lg94;->d(Ln84;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->X:I

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    iget-boolean v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->Z:Z

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    sget-object v2, Ln84;->ON_STOP:Ln84;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lg94;->d(Ln84;)V

    .line 61
    .line 62
    .line 63
    iput-boolean v5, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->f0:Z

    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :pswitch_1
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Llt5;

    .line 69
    .line 70
    invoke-virtual {v0}, Lhq8;->r()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 77
    .line 78
    sget-object v1, Lcom/google/android/material/button/MaterialButton;->T0:[I

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/android/material/button/MaterialButton;->r()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_3
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lbm3;

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {v0, v4}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :pswitch_4
    invoke-direct {v0}, Lc1;->b()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_5
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Landroid/widget/EditText;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_6
    invoke-direct {v0}, Lc1;->a()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_7
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lml2;

    .line 113
    .line 114
    iget-object v0, v0, Lml2;->n:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    invoke-static {v0}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    throw v0

    .line 132
    :pswitch_8
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 133
    .line 134
    move-object v1, v0

    .line 135
    check-cast v1, Loi2;

    .line 136
    .line 137
    const-string v0, "fetchFonts result is not OK. ("

    .line 138
    .line 139
    iget-object v4, v1, Loi2;->c:Ljava/lang/Object;

    .line 140
    .line 141
    monitor-enter v4

    .line 142
    :try_start_0
    iget-object v5, v1, Loi2;->g:Lpu;

    .line 143
    .line 144
    if-nez v5, :cond_4

    .line 145
    .line 146
    monitor-exit v4

    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_4
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    :try_start_1
    invoke-virtual {v1}, Loi2;->c()Lgj2;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget v5, v4, Lgj2;->f:I

    .line 158
    .line 159
    if-ne v5, v2, :cond_5

    .line 160
    .line 161
    iget-object v2, v1, Loi2;->c:Ljava/lang/Object;

    .line 162
    .line 163
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 164
    :try_start_2
    monitor-exit v2

    .line 165
    goto :goto_0

    .line 166
    :catchall_1
    move-exception v0

    .line 167
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 168
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    goto/16 :goto_4

    .line 171
    .line 172
    :cond_5
    :goto_0
    if-nez v5, :cond_8

    .line 173
    .line 174
    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 175
    .line 176
    sget-object v2, Lwc8;->b:Ljava/lang/reflect/Method;

    .line 177
    .line 178
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, v1, Loi2;->a:Landroid/content/Context;

    .line 182
    .line 183
    filled-new-array {v4}, [Lgj2;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    sget-object v5, Lhj8;->a:Lg28;

    .line 188
    .line 189
    const-string v5, "TypefaceCompat.createFromFontInfo"

    .line 190
    .line 191
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 192
    .line 193
    .line 194
    :try_start_5
    sget-object v5, Lhj8;->a:Lg28;

    .line 195
    .line 196
    invoke-virtual {v5, v0, v2, v3}, Lg28;->f(Landroid/content/Context;[Lgj2;I)Landroid/graphics/Typeface;

    .line 197
    .line 198
    .line 199
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 200
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 201
    .line 202
    .line 203
    iget-object v2, v1, Loi2;->a:Landroid/content/Context;

    .line 204
    .line 205
    iget-object v3, v4, Lgj2;->a:Landroid/net/Uri;

    .line 206
    .line 207
    invoke-static {v2, v3}, Lu28;->k(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 211
    if-eqz v2, :cond_7

    .line 212
    .line 213
    if-eqz v0, :cond_7

    .line 214
    .line 215
    :try_start_7
    const-string v3, "EmojiCompat.MetadataRepo.create"

    .line 216
    .line 217
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v3, Lz47;

    .line 221
    .line 222
    invoke-static {v2}, Los4;->G(Ljava/nio/MappedByteBuffer;)Lev4;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-direct {v3, v0, v2}, Lz47;-><init>(Landroid/graphics/Typeface;Lev4;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 227
    .line 228
    .line 229
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 230
    .line 231
    .line 232
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 233
    .line 234
    .line 235
    iget-object v2, v1, Loi2;->c:Ljava/lang/Object;

    .line 236
    .line 237
    monitor-enter v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 238
    :try_start_a
    iget-object v0, v1, Loi2;->g:Lpu;

    .line 239
    .line 240
    if-eqz v0, :cond_6

    .line 241
    .line 242
    invoke-virtual {v0, v3}, Lpu;->E(Lz47;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :catchall_3
    move-exception v0

    .line 247
    goto :goto_2

    .line 248
    :cond_6
    :goto_1
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 249
    :try_start_b
    invoke-virtual {v1}, Loi2;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :goto_2
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 254
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 255
    :catchall_4
    move-exception v0

    .line 256
    :try_start_e
    sget-object v2, Lwc8;->b:Ljava/lang/reflect/Method;

    .line 257
    .line 258
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 263
    .line 264
    const-string v2, "Unable to open file."

    .line 265
    .line 266
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :catchall_5
    move-exception v0

    .line 271
    goto :goto_3

    .line 272
    :catchall_6
    move-exception v0

    .line 273
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 274
    .line 275
    .line 276
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 277
    :goto_3
    :try_start_f
    sget-object v2, Lwc8;->b:Ljava/lang/reflect/Method;

    .line 278
    .line 279
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :cond_8
    new-instance v2, Ljava/lang/RuntimeException;

    .line 284
    .line 285
    new-instance v3, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const-string v0, ")"

    .line 294
    .line 295
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 306
    :goto_4
    iget-object v2, v1, Loi2;->c:Ljava/lang/Object;

    .line 307
    .line 308
    monitor-enter v2

    .line 309
    :try_start_10
    iget-object v3, v1, Loi2;->g:Lpu;

    .line 310
    .line 311
    if-eqz v3, :cond_9

    .line 312
    .line 313
    invoke-virtual {v3, v0}, Lpu;->D(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    goto :goto_5

    .line 317
    :catchall_7
    move-exception v0

    .line 318
    goto :goto_7

    .line 319
    :cond_9
    :goto_5
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 320
    invoke-virtual {v1}, Loi2;->b()V

    .line 321
    .line 322
    .line 323
    :goto_6
    return-void

    .line 324
    :goto_7
    :try_start_11
    monitor-exit v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 325
    throw v0

    .line 326
    :goto_8
    :try_start_12
    monitor-exit v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 327
    throw v0

    .line 328
    :pswitch_9
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Ly5;

    .line 331
    .line 332
    iget-object v0, v0, Ly5;->f0:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Lex1;

    .line 335
    .line 336
    if-eqz v0, :cond_a

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    if-eqz v1, :cond_a

    .line 351
    .line 352
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, Lxx7;

    .line 357
    .line 358
    invoke-virtual {v1}, Lxx7;->b()V

    .line 359
    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_a
    return-void

    .line 363
    :pswitch_a
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, Lcx1;

    .line 366
    .line 367
    iput-boolean v5, v0, Lcx1;->f:Z

    .line 368
    .line 369
    invoke-virtual {v0}, Lcx1;->d()V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_b
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lyw1;

    .line 376
    .line 377
    iget-object v1, v0, Lyw1;->h:Landroid/widget/AutoCompleteTextView;

    .line 378
    .line 379
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    invoke-virtual {v0, v1}, Lyw1;->s(Z)V

    .line 384
    .line 385
    .line 386
    iput-boolean v1, v0, Lyw1;->m:Z

    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_c
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Lkn1;

    .line 392
    .line 393
    iget-object v0, v0, Lkn1;->u1:Ly5;

    .line 394
    .line 395
    if-eqz v0, :cond_b

    .line 396
    .line 397
    iget-object v0, v0, Ly5;->f0:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/button/HappTextButton;

    .line 400
    .line 401
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_b
    const-string v0, "binding"

    .line 406
    .line 407
    invoke-static {v0}, Ldh3;->T(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v4

    .line 411
    :pswitch_d
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, Lby7;

    .line 414
    .line 415
    invoke-virtual {v0}, Lby7;->close()V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_e
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, Ljg1;

    .line 422
    .line 423
    iput-boolean v5, v0, Ljg1;->j:Z

    .line 424
    .line 425
    invoke-virtual {v0}, Ljg1;->d()V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_f
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lpy0;

    .line 432
    .line 433
    invoke-static {v0}, Lpy0;->e(Lpy0;)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_10
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Lky0;

    .line 440
    .line 441
    iget-object v1, v0, Lky0;->Y:Ljava/lang/Runnable;

    .line 442
    .line 443
    if-eqz v1, :cond_c

    .line 444
    .line 445
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 446
    .line 447
    .line 448
    iput-object v4, v0, Lky0;->Y:Ljava/lang/Runnable;

    .line 449
    .line 450
    :cond_c
    return-void

    .line 451
    :pswitch_11
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Lwt0;

    .line 454
    .line 455
    invoke-virtual {v0, v5}, Lwt0;->s(Z)V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :pswitch_12
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 462
    .line 463
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->K0()V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :pswitch_13
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, Ljava/lang/Runnable;

    .line 470
    .line 471
    const/4 v1, -0x3

    .line 472
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :pswitch_14
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Log0;

    .line 482
    .line 483
    new-instance v1, Lr5;

    .line 484
    .line 485
    const/4 v2, 0x4

    .line 486
    invoke-direct {v1, v0, v4, v2}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 487
    .line 488
    .line 489
    invoke-static {v1}, Li21;->S(Lrn2;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :pswitch_15
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Lzf0;

    .line 496
    .line 497
    iget-object v0, v0, Lzf0;->e:Lm51;

    .line 498
    .line 499
    invoke-static {v0, v4}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :pswitch_16
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Lpw;

    .line 506
    .line 507
    iget-object v0, v0, Lpw;->a:Lm51;

    .line 508
    .line 509
    invoke-static {v0, v4}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :pswitch_17
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, Llk;

    .line 516
    .line 517
    iget-object v0, v0, Llk;->c:Lwl6;

    .line 518
    .line 519
    iget-object v0, v0, Lwl6;->Y:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, Llk;

    .line 522
    .line 523
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 524
    .line 525
    .line 526
    move-result-wide v1

    .line 527
    iget-object v4, v0, Llk;->b:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 530
    .line 531
    .line 532
    move-result-wide v6

    .line 533
    move v8, v3

    .line 534
    :goto_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 535
    .line 536
    .line 537
    move-result v9

    .line 538
    if-ge v8, v9, :cond_17

    .line 539
    .line 540
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    check-cast v9, Ltf7;

    .line 545
    .line 546
    if-nez v9, :cond_e

    .line 547
    .line 548
    :cond_d
    :goto_b
    move/from16 v28, v5

    .line 549
    .line 550
    move-wide/from16 v29, v6

    .line 551
    .line 552
    goto/16 :goto_11

    .line 553
    .line 554
    :cond_e
    iget-object v10, v0, Llk;->a:Ll97;

    .line 555
    .line 556
    invoke-virtual {v10, v9}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v11

    .line 560
    check-cast v11, Ljava/lang/Long;

    .line 561
    .line 562
    if-nez v11, :cond_f

    .line 563
    .line 564
    goto :goto_c

    .line 565
    :cond_f
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 566
    .line 567
    .line 568
    move-result-wide v11

    .line 569
    cmp-long v11, v11, v6

    .line 570
    .line 571
    if-gez v11, :cond_d

    .line 572
    .line 573
    invoke-virtual {v10, v9}, Ll97;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    :goto_c
    iget-wide v10, v9, Ltf7;->i:J

    .line 577
    .line 578
    const-wide/16 v12, 0x0

    .line 579
    .line 580
    cmp-long v12, v10, v12

    .line 581
    .line 582
    if-nez v12, :cond_10

    .line 583
    .line 584
    iput-wide v1, v9, Ltf7;->i:J

    .line 585
    .line 586
    iget v10, v9, Ltf7;->b:F

    .line 587
    .line 588
    invoke-virtual {v9, v10}, Ltf7;->e(F)V

    .line 589
    .line 590
    .line 591
    goto :goto_b

    .line 592
    :cond_10
    sub-long v10, v1, v10

    .line 593
    .line 594
    iput-wide v1, v9, Ltf7;->i:J

    .line 595
    .line 596
    invoke-static {}, Ltf7;->c()Llk;

    .line 597
    .line 598
    .line 599
    move-result-object v12

    .line 600
    iget v12, v12, Llk;->g:F

    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    cmpl-float v14, v12, v13

    .line 604
    .line 605
    if-nez v14, :cond_11

    .line 606
    .line 607
    const-wide/32 v10, 0x7fffffff

    .line 608
    .line 609
    .line 610
    :goto_d
    move-wide/from16 v19, v10

    .line 611
    .line 612
    goto :goto_e

    .line 613
    :cond_11
    long-to-float v10, v10

    .line 614
    div-float/2addr v10, v12

    .line 615
    float-to-long v10, v10

    .line 616
    goto :goto_d

    .line 617
    :goto_e
    iget-boolean v10, v9, Ltf7;->o:Z

    .line 618
    .line 619
    iget v11, v9, Ltf7;->n:F

    .line 620
    .line 621
    const v12, 0x7f7fffff    # Float.MAX_VALUE

    .line 622
    .line 623
    .line 624
    if-eqz v10, :cond_13

    .line 625
    .line 626
    cmpl-float v10, v11, v12

    .line 627
    .line 628
    if-eqz v10, :cond_12

    .line 629
    .line 630
    iget-object v10, v9, Ltf7;->m:Luf7;

    .line 631
    .line 632
    float-to-double v14, v11

    .line 633
    iput-wide v14, v10, Luf7;->i:D

    .line 634
    .line 635
    iput v12, v9, Ltf7;->n:F

    .line 636
    .line 637
    :cond_12
    iget-object v10, v9, Ltf7;->m:Luf7;

    .line 638
    .line 639
    iget-wide v10, v10, Luf7;->i:D

    .line 640
    .line 641
    double-to-float v10, v10

    .line 642
    iput v10, v9, Ltf7;->b:F

    .line 643
    .line 644
    iput v13, v9, Ltf7;->a:F

    .line 645
    .line 646
    iput-boolean v3, v9, Ltf7;->o:Z

    .line 647
    .line 648
    move/from16 v28, v5

    .line 649
    .line 650
    move-wide/from16 v29, v6

    .line 651
    .line 652
    goto/16 :goto_10

    .line 653
    .line 654
    :cond_13
    cmpl-float v10, v11, v12

    .line 655
    .line 656
    iget-object v14, v9, Ltf7;->m:Luf7;

    .line 657
    .line 658
    iget v11, v9, Ltf7;->b:F

    .line 659
    .line 660
    iget v15, v9, Ltf7;->a:F

    .line 661
    .line 662
    if-eqz v10, :cond_14

    .line 663
    .line 664
    float-to-double v10, v11

    .line 665
    move/from16 v28, v5

    .line 666
    .line 667
    move-wide/from16 v29, v6

    .line 668
    .line 669
    float-to-double v5, v15

    .line 670
    const-wide/16 v15, 0x2

    .line 671
    .line 672
    div-long v26, v19, v15

    .line 673
    .line 674
    move-wide/from16 v24, v5

    .line 675
    .line 676
    move-wide/from16 v22, v10

    .line 677
    .line 678
    move-object/from16 v21, v14

    .line 679
    .line 680
    invoke-virtual/range {v21 .. v27}, Luf7;->c(DDJ)Lnx1;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    iget-object v6, v9, Ltf7;->m:Luf7;

    .line 685
    .line 686
    iget v7, v9, Ltf7;->n:F

    .line 687
    .line 688
    float-to-double v10, v7

    .line 689
    iput-wide v10, v6, Luf7;->i:D

    .line 690
    .line 691
    iput v12, v9, Ltf7;->n:F

    .line 692
    .line 693
    iget v7, v5, Lnx1;->a:F

    .line 694
    .line 695
    float-to-double v10, v7

    .line 696
    iget v5, v5, Lnx1;->b:F

    .line 697
    .line 698
    float-to-double v14, v5

    .line 699
    move-object/from16 v21, v6

    .line 700
    .line 701
    move-wide/from16 v22, v10

    .line 702
    .line 703
    move-wide/from16 v24, v14

    .line 704
    .line 705
    invoke-virtual/range {v21 .. v27}, Luf7;->c(DDJ)Lnx1;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    iget v6, v5, Lnx1;->a:F

    .line 710
    .line 711
    iput v6, v9, Ltf7;->b:F

    .line 712
    .line 713
    iget v5, v5, Lnx1;->b:F

    .line 714
    .line 715
    iput v5, v9, Ltf7;->a:F

    .line 716
    .line 717
    goto :goto_f

    .line 718
    :cond_14
    move/from16 v28, v5

    .line 719
    .line 720
    move-wide/from16 v29, v6

    .line 721
    .line 722
    move-object/from16 v21, v14

    .line 723
    .line 724
    float-to-double v5, v11

    .line 725
    float-to-double v10, v15

    .line 726
    move-wide v15, v5

    .line 727
    move-wide/from16 v17, v10

    .line 728
    .line 729
    invoke-virtual/range {v14 .. v20}, Luf7;->c(DDJ)Lnx1;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    iget v6, v5, Lnx1;->a:F

    .line 734
    .line 735
    iput v6, v9, Ltf7;->b:F

    .line 736
    .line 737
    iget v5, v5, Lnx1;->b:F

    .line 738
    .line 739
    iput v5, v9, Ltf7;->a:F

    .line 740
    .line 741
    :goto_f
    iget v5, v9, Ltf7;->h:F

    .line 742
    .line 743
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    iput v5, v9, Ltf7;->b:F

    .line 748
    .line 749
    iget v6, v9, Ltf7;->g:F

    .line 750
    .line 751
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 752
    .line 753
    .line 754
    move-result v5

    .line 755
    iput v5, v9, Ltf7;->b:F

    .line 756
    .line 757
    iget v6, v9, Ltf7;->a:F

    .line 758
    .line 759
    iget-object v7, v9, Ltf7;->m:Luf7;

    .line 760
    .line 761
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 765
    .line 766
    .line 767
    move-result v6

    .line 768
    float-to-double v10, v6

    .line 769
    iget-wide v14, v7, Luf7;->e:D

    .line 770
    .line 771
    cmpg-double v6, v10, v14

    .line 772
    .line 773
    if-gez v6, :cond_15

    .line 774
    .line 775
    iget-wide v10, v7, Luf7;->i:D

    .line 776
    .line 777
    double-to-float v6, v10

    .line 778
    sub-float/2addr v5, v6

    .line 779
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    float-to-double v5, v5

    .line 784
    iget-wide v10, v7, Luf7;->d:D

    .line 785
    .line 786
    cmpg-double v5, v5, v10

    .line 787
    .line 788
    if-gez v5, :cond_15

    .line 789
    .line 790
    iget-object v5, v9, Ltf7;->m:Luf7;

    .line 791
    .line 792
    iget-wide v5, v5, Luf7;->i:D

    .line 793
    .line 794
    double-to-float v5, v5

    .line 795
    iput v5, v9, Ltf7;->b:F

    .line 796
    .line 797
    iput v13, v9, Ltf7;->a:F

    .line 798
    .line 799
    move/from16 v5, v28

    .line 800
    .line 801
    goto :goto_10

    .line 802
    :cond_15
    move v5, v3

    .line 803
    :goto_10
    iget v6, v9, Ltf7;->b:F

    .line 804
    .line 805
    iget v7, v9, Ltf7;->g:F

    .line 806
    .line 807
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    iput v6, v9, Ltf7;->b:F

    .line 812
    .line 813
    iget v7, v9, Ltf7;->h:F

    .line 814
    .line 815
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 816
    .line 817
    .line 818
    move-result v6

    .line 819
    iput v6, v9, Ltf7;->b:F

    .line 820
    .line 821
    invoke-virtual {v9, v6}, Ltf7;->e(F)V

    .line 822
    .line 823
    .line 824
    if-eqz v5, :cond_16

    .line 825
    .line 826
    invoke-virtual {v9, v3}, Ltf7;->b(Z)V

    .line 827
    .line 828
    .line 829
    :cond_16
    :goto_11
    add-int/lit8 v8, v8, 0x1

    .line 830
    .line 831
    move/from16 v5, v28

    .line 832
    .line 833
    move-wide/from16 v6, v29

    .line 834
    .line 835
    goto/16 :goto_a

    .line 836
    .line 837
    :cond_17
    move/from16 v28, v5

    .line 838
    .line 839
    iget-boolean v1, v0, Llk;->f:Z

    .line 840
    .line 841
    if-eqz v1, :cond_1b

    .line 842
    .line 843
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 844
    .line 845
    .line 846
    move-result v1

    .line 847
    add-int/lit8 v1, v1, -0x1

    .line 848
    .line 849
    :goto_12
    if-ltz v1, :cond_19

    .line 850
    .line 851
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    if-nez v2, :cond_18

    .line 856
    .line 857
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    :cond_18
    add-int/lit8 v1, v1, -0x1

    .line 861
    .line 862
    goto :goto_12

    .line 863
    :cond_19
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    if-nez v1, :cond_1a

    .line 868
    .line 869
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 870
    .line 871
    const/16 v2, 0x21

    .line 872
    .line 873
    if-lt v1, v2, :cond_1a

    .line 874
    .line 875
    iget-object v1, v0, Llk;->h:Ljk;

    .line 876
    .line 877
    invoke-virtual {v1}, Ljk;->a()Z

    .line 878
    .line 879
    .line 880
    :cond_1a
    iput-boolean v3, v0, Llk;->f:Z

    .line 881
    .line 882
    :cond_1b
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 883
    .line 884
    .line 885
    move-result v1

    .line 886
    if-lez v1, :cond_1c

    .line 887
    .line 888
    iget-object v1, v0, Llk;->e:Ldq;

    .line 889
    .line 890
    iget-object v0, v0, Llk;->d:Lc1;

    .line 891
    .line 892
    iget-object v1, v1, Ldq;->Y:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v1, Landroid/view/Choreographer;

    .line 895
    .line 896
    new-instance v2, Lkk;

    .line 897
    .line 898
    invoke-direct {v2, v0}, Lkk;-><init>(Lc1;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 902
    .line 903
    .line 904
    :cond_1c
    return-void

    .line 905
    :pswitch_18
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lch;

    .line 908
    .line 909
    iget-object v0, v0, Lch;->h:Landroid/view/ActionMode;

    .line 910
    .line 911
    if-eqz v0, :cond_1d

    .line 912
    .line 913
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 914
    .line 915
    .line 916
    :cond_1d
    return-void

    .line 917
    :pswitch_19
    move/from16 v28, v5

    .line 918
    .line 919
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v0, Lvc;

    .line 922
    .line 923
    invoke-virtual {v0}, Lvc;->d()Z

    .line 924
    .line 925
    .line 926
    move-result v1

    .line 927
    iget-object v4, v0, Lvc;->X:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 928
    .line 929
    if-nez v1, :cond_1e

    .line 930
    .line 931
    goto/16 :goto_17

    .line 932
    .line 933
    :cond_1e
    const-string v1, "ContentCapture:changeChecker"

    .line 934
    .line 935
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    move/from16 v1, v28

    .line 939
    .line 940
    :try_start_13
    invoke-virtual {v4, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->q(Z)V

    .line 941
    .line 942
    .line 943
    iget-object v1, v0, Lvc;->l0:Lvz4;

    .line 944
    .line 945
    iget-object v5, v1, Lff3;->b:[I

    .line 946
    .line 947
    iget-object v1, v1, Lff3;->a:[J

    .line 948
    .line 949
    array-length v6, v1

    .line 950
    sub-int/2addr v6, v2

    .line 951
    if-ltz v6, :cond_22

    .line 952
    .line 953
    move v2, v3

    .line 954
    :goto_13
    aget-wide v7, v1, v2

    .line 955
    .line 956
    not-long v9, v7

    .line 957
    const/4 v11, 0x7

    .line 958
    shl-long/2addr v9, v11

    .line 959
    and-long/2addr v9, v7

    .line 960
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    and-long/2addr v9, v11

    .line 966
    cmp-long v9, v9, v11

    .line 967
    .line 968
    if-eqz v9, :cond_21

    .line 969
    .line 970
    sub-int v9, v2, v6

    .line 971
    .line 972
    not-int v9, v9

    .line 973
    ushr-int/lit8 v9, v9, 0x1f

    .line 974
    .line 975
    const/16 v10, 0x8

    .line 976
    .line 977
    rsub-int/lit8 v9, v9, 0x8

    .line 978
    .line 979
    move v11, v3

    .line 980
    :goto_14
    if-ge v11, v9, :cond_20

    .line 981
    .line 982
    const-wide/16 v12, 0xff

    .line 983
    .line 984
    and-long/2addr v12, v7

    .line 985
    const-wide/16 v14, 0x80

    .line 986
    .line 987
    cmp-long v12, v12, v14

    .line 988
    .line 989
    if-gez v12, :cond_1f

    .line 990
    .line 991
    shl-int/lit8 v12, v2, 0x3

    .line 992
    .line 993
    add-int/2addr v12, v11

    .line 994
    aget v14, v5, v12

    .line 995
    .line 996
    invoke-virtual {v0}, Lvc;->c()Lff3;

    .line 997
    .line 998
    .line 999
    move-result-object v12

    .line 1000
    invoke-virtual {v12, v14}, Lff3;->a(I)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v12

    .line 1004
    if-nez v12, :cond_1f

    .line 1005
    .line 1006
    iget-object v12, v0, Lvc;->f0:Ljava/util/ArrayList;

    .line 1007
    .line 1008
    new-instance v13, Lf41;

    .line 1009
    .line 1010
    move-object/from16 v20, v4

    .line 1011
    .line 1012
    iget-wide v3, v0, Lvc;->k0:J

    .line 1013
    .line 1014
    sget-object v17, Lg41;->Y:Lg41;

    .line 1015
    .line 1016
    const/16 v18, 0x0

    .line 1017
    .line 1018
    move-wide v15, v3

    .line 1019
    invoke-direct/range {v13 .. v18}, Lf41;-><init>(IJLg41;Llr5;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    iget-object v3, v0, Lvc;->i0:Lx90;

    .line 1026
    .line 1027
    sget-object v4, Ldn8;->a:Ldn8;

    .line 1028
    .line 1029
    invoke-interface {v3, v4}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    goto :goto_15

    .line 1033
    :cond_1f
    move-object/from16 v20, v4

    .line 1034
    .line 1035
    :goto_15
    shr-long/2addr v7, v10

    .line 1036
    add-int/lit8 v11, v11, 0x1

    .line 1037
    .line 1038
    move-object/from16 v4, v20

    .line 1039
    .line 1040
    const/4 v3, 0x0

    .line 1041
    goto :goto_14

    .line 1042
    :cond_20
    move-object/from16 v20, v4

    .line 1043
    .line 1044
    if-ne v9, v10, :cond_23

    .line 1045
    .line 1046
    goto :goto_16

    .line 1047
    :cond_21
    move-object/from16 v20, v4

    .line 1048
    .line 1049
    :goto_16
    if-eq v2, v6, :cond_23

    .line 1050
    .line 1051
    add-int/lit8 v2, v2, 0x1

    .line 1052
    .line 1053
    move-object/from16 v4, v20

    .line 1054
    .line 1055
    const/4 v3, 0x0

    .line 1056
    goto :goto_13

    .line 1057
    :cond_22
    move-object/from16 v20, v4

    .line 1058
    .line 1059
    :cond_23
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 1060
    .line 1061
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1062
    .line 1063
    .line 1064
    :try_start_14
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Lb17;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-virtual {v1}, Lb17;->a()Ly07;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    iget-object v2, v0, Lvc;->m0:Lz07;

    .line 1073
    .line 1074
    invoke-virtual {v0, v1, v2}, Lvc;->f(Ly07;Lz07;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 1075
    .line 1076
    .line 1077
    :try_start_15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v0}, Lvc;->c()Lff3;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    invoke-virtual {v0, v1}, Lvc;->b(Lff3;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v0}, Lvc;->j()V

    .line 1088
    .line 1089
    .line 1090
    const/4 v1, 0x0

    .line 1091
    iput-boolean v1, v0, Lvc;->n0:Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 1092
    .line 1093
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1094
    .line 1095
    .line 1096
    :goto_17
    return-void

    .line 1097
    :catchall_8
    move-exception v0

    .line 1098
    :try_start_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1099
    .line 1100
    .line 1101
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 1102
    :catchall_9
    move-exception v0

    .line 1103
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1104
    .line 1105
    .line 1106
    throw v0

    .line 1107
    :pswitch_1a
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v0, Lgc;

    .line 1110
    .line 1111
    const-string v1, "Compose:semantics:measureAndLayout"

    .line 1112
    .line 1113
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    :try_start_17
    iget-object v1, v0, Lgc;->f0:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1117
    .line 1118
    const/4 v3, 0x1

    .line 1119
    invoke-virtual {v1, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->q(Z)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1120
    .line 1121
    .line 1122
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1123
    .line 1124
    .line 1125
    const-string v1, "Compose:semantics:checkForSemanticsChanges"

    .line 1126
    .line 1127
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    :try_start_18
    invoke-virtual {v0}, Lgc;->n()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 1131
    .line 1132
    .line 1133
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1134
    .line 1135
    .line 1136
    const/4 v1, 0x0

    .line 1137
    iput-boolean v1, v0, Lgc;->K0:Z

    .line 1138
    .line 1139
    return-void

    .line 1140
    :catchall_a
    move-exception v0

    .line 1141
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1142
    .line 1143
    .line 1144
    throw v0

    .line 1145
    :catchall_b
    move-exception v0

    .line 1146
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1147
    .line 1148
    .line 1149
    throw v0

    .line 1150
    :pswitch_1b
    move v3, v5

    .line 1151
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 1152
    .line 1153
    move-object v1, v0

    .line 1154
    check-cast v1, Landroid/app/Activity;

    .line 1155
    .line 1156
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v0

    .line 1160
    if-nez v0, :cond_2d

    .line 1161
    .line 1162
    sget-object v4, Lf6;->g:Landroid/os/Handler;

    .line 1163
    .line 1164
    sget-object v0, Lf6;->f:Ljava/lang/reflect/Method;

    .line 1165
    .line 1166
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1167
    .line 1168
    const/16 v6, 0x1c

    .line 1169
    .line 1170
    if-lt v5, v6, :cond_24

    .line 1171
    .line 1172
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1173
    .line 1174
    .line 1175
    goto/16 :goto_1d

    .line 1176
    .line 1177
    :cond_24
    const/16 v6, 0x1b

    .line 1178
    .line 1179
    const/16 v7, 0x1a

    .line 1180
    .line 1181
    if-eq v5, v7, :cond_25

    .line 1182
    .line 1183
    if-ne v5, v6, :cond_26

    .line 1184
    .line 1185
    :cond_25
    if-nez v0, :cond_26

    .line 1186
    .line 1187
    goto/16 :goto_1c

    .line 1188
    .line 1189
    :cond_26
    sget-object v8, Lf6;->e:Ljava/lang/reflect/Method;

    .line 1190
    .line 1191
    if-nez v8, :cond_27

    .line 1192
    .line 1193
    sget-object v8, Lf6;->d:Ljava/lang/reflect/Method;

    .line 1194
    .line 1195
    if-nez v8, :cond_27

    .line 1196
    .line 1197
    goto/16 :goto_1c

    .line 1198
    .line 1199
    :cond_27
    :try_start_19
    sget-object v8, Lf6;->c:Ljava/lang/reflect/Field;

    .line 1200
    .line 1201
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v9

    .line 1205
    if-nez v9, :cond_28

    .line 1206
    .line 1207
    goto/16 :goto_1c

    .line 1208
    .line 1209
    :cond_28
    sget-object v8, Lf6;->b:Ljava/lang/reflect/Field;

    .line 1210
    .line 1211
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v8

    .line 1215
    if-nez v8, :cond_29

    .line 1216
    .line 1217
    goto :goto_1c

    .line 1218
    :cond_29
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v10

    .line 1222
    new-instance v11, Le6;

    .line 1223
    .line 1224
    invoke-direct {v11, v1}, Le6;-><init>(Landroid/app/Activity;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v10, v11}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1228
    .line 1229
    .line 1230
    new-instance v12, Lzo2;

    .line 1231
    .line 1232
    invoke-direct {v12, v11, v9, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v4, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_e

    .line 1236
    .line 1237
    .line 1238
    if-eq v5, v7, :cond_2b

    .line 1239
    .line 1240
    if-ne v5, v6, :cond_2a

    .line 1241
    .line 1242
    goto :goto_18

    .line 1243
    :cond_2a
    const/4 v5, 0x0

    .line 1244
    goto :goto_19

    .line 1245
    :cond_2b
    :goto_18
    move v5, v3

    .line 1246
    :goto_19
    const/4 v2, 0x3

    .line 1247
    if-eqz v5, :cond_2c

    .line 1248
    .line 1249
    const/16 v19, 0x0

    .line 1250
    .line 1251
    :try_start_1a
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v12

    .line 1255
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    .line 1256
    .line 1257
    const/4 v14, 0x0

    .line 1258
    const/4 v15, 0x0

    .line 1259
    move-object v3, v10

    .line 1260
    const/4 v10, 0x0

    .line 1261
    move-object v5, v11

    .line 1262
    const/4 v11, 0x0

    .line 1263
    move-object/from16 v16, v13

    .line 1264
    .line 1265
    move-object/from16 v17, v13

    .line 1266
    .line 1267
    :try_start_1b
    filled-new-array/range {v9 .. v17}, [Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v6

    .line 1271
    invoke-virtual {v0, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    goto :goto_1a

    .line 1275
    :catchall_c
    move-exception v0

    .line 1276
    goto :goto_1b

    .line 1277
    :catchall_d
    move-exception v0

    .line 1278
    move-object v3, v10

    .line 1279
    move-object v5, v11

    .line 1280
    goto :goto_1b

    .line 1281
    :cond_2c
    move-object v3, v10

    .line 1282
    move-object v5, v11

    .line 1283
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 1284
    .line 1285
    .line 1286
    :goto_1a
    :try_start_1c
    new-instance v0, Lzo2;

    .line 1287
    .line 1288
    invoke-direct {v0, v3, v5, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1292
    .line 1293
    .line 1294
    goto :goto_1d

    .line 1295
    :goto_1b
    new-instance v6, Lzo2;

    .line 1296
    .line 1297
    invoke-direct {v6, v3, v5, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1301
    .line 1302
    .line 1303
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_e

    .line 1304
    :catchall_e
    :goto_1c
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1305
    .line 1306
    .line 1307
    :cond_2d
    :goto_1d
    return-void

    .line 1308
    :pswitch_1c
    iget-object v0, v0, Lc1;->Y:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v0, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 1311
    .line 1312
    sget v1, Landroidx/compose/ui/platform/AbstractComposeView;->o0:I

    .line 1313
    .line 1314
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AbstractComposeView;->b()V

    .line 1315
    .line 1316
    .line 1317
    return-void

    .line 1318
    nop

    .line 1319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
