.class public final Lio/sentry/android/core/internal/gestures/h;
.super Lio/sentry/android/core/internal/gestures/j;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final Y:Landroid/view/Window$Callback;

.field public final Z:Lio/sentry/android/core/internal/gestures/g;

.field public final f0:Lio/sentry/android/core/internal/gestures/c;

.field public final g0:Lio/sentry/s6;

.field public volatile h0:Z


# direct methods
.method public constructor <init>(Landroid/view/Window$Callback;Landroid/app/Activity;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/s6;)V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/internal/gestures/c;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Lio/sentry/android/core/internal/gestures/c;-><init>(Landroid/app/Activity;Lio/sentry/android/core/internal/gestures/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lio/sentry/android/core/internal/gestures/j;-><init>(Landroid/view/Window$Callback;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/h;->Y:Landroid/view/Window$Callback;

    .line 10
    .line 11
    iput-object p3, p0, Lio/sentry/android/core/internal/gestures/h;->Z:Lio/sentry/android/core/internal/gestures/g;

    .line 12
    .line 13
    iput-object p4, p0, Lio/sentry/android/core/internal/gestures/h;->g0:Lio/sentry/s6;

    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->f0:Lio/sentry/android/core/internal/gestures/c;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/internal/gestures/h;->h0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/h;->f0:Lio/sentry/android/core/internal/gestures/c;

    .line 8
    .line 9
    iget v1, v0, Lio/sentry/android/core/internal/gestures/c;->c:I

    .line 10
    .line 11
    iget-object v2, v0, Lio/sentry/android/core/internal/gestures/c;->a:Lio/sentry/android/core/internal/gestures/g;

    .line 12
    .line 13
    iget-object v3, v0, Lio/sentry/android/core/internal/gestures/c;->m:Lio/sentry/util/a;

    .line 14
    .line 15
    invoke-virtual {v3}, Lio/sentry/util/a;->g()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    iget-object v5, v0, Lio/sentry/android/core/internal/gestures/c;->l:Landroid/view/VelocityTracker;

    .line 23
    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iput-object v5, v0, Lio/sentry/android/core/internal/gestures/c;->l:Landroid/view/VelocityTracker;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v5, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v4, :cond_a

    .line 42
    .line 43
    if-eq v4, v6, :cond_5

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    if-eq v4, v1, :cond_4

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    if-eq v4, v1, :cond_3

    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    if-eq v4, v1, :cond_2

    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_2
    iput-boolean v5, v0, Lio/sentry/android/core/internal/gestures/c;->e:Z

    .line 57
    .line 58
    iput-boolean v6, v0, Lio/sentry/android/core/internal/gestures/c;->f:Z

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/c;->a()V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    iget v7, v0, Lio/sentry/android/core/internal/gestures/c;->g:F

    .line 76
    .line 77
    sub-float v7, v1, v7

    .line 78
    .line 79
    iget v8, v0, Lio/sentry/android/core/internal/gestures/c;->h:F

    .line 80
    .line 81
    sub-float v8, v4, v8

    .line 82
    .line 83
    mul-float/2addr v7, v7

    .line 84
    mul-float/2addr v8, v8

    .line 85
    add-float/2addr v8, v7

    .line 86
    iget v7, v0, Lio/sentry/android/core/internal/gestures/c;->b:I

    .line 87
    .line 88
    int-to-float v7, v7

    .line 89
    cmpl-float v7, v8, v7

    .line 90
    .line 91
    if-lez v7, :cond_c

    .line 92
    .line 93
    iget v7, v0, Lio/sentry/android/core/internal/gestures/c;->i:F

    .line 94
    .line 95
    sub-float/2addr v7, v1

    .line 96
    iget v8, v0, Lio/sentry/android/core/internal/gestures/c;->j:F

    .line 97
    .line 98
    sub-float/2addr v8, v4

    .line 99
    iget-object v9, v0, Lio/sentry/android/core/internal/gestures/c;->k:Landroid/view/MotionEvent;

    .line 100
    .line 101
    invoke-virtual {v2, v9, p1, v7, v8}, Lio/sentry/android/core/internal/gestures/g;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 102
    .line 103
    .line 104
    iput-boolean v5, v0, Lio/sentry/android/core/internal/gestures/c;->e:Z

    .line 105
    .line 106
    iput v1, v0, Lio/sentry/android/core/internal/gestures/c;->i:F

    .line 107
    .line 108
    iput v4, v0, Lio/sentry/android/core/internal/gestures/c;->j:F

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    iget-boolean v4, v0, Lio/sentry/android/core/internal/gestures/c;->f:Z

    .line 112
    .line 113
    if-eqz v4, :cond_6

    .line 114
    .line 115
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/c;->a()V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    iget-boolean v4, v0, Lio/sentry/android/core/internal/gestures/c;->e:Z

    .line 120
    .line 121
    if-eqz v4, :cond_7

    .line 122
    .line 123
    invoke-virtual {v2, p1}, Lio/sentry/android/core/internal/gestures/g;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    iget-object v7, v0, Lio/sentry/android/core/internal/gestures/c;->l:Landroid/view/VelocityTracker;

    .line 132
    .line 133
    iget v8, v0, Lio/sentry/android/core/internal/gestures/c;->d:I

    .line 134
    .line 135
    int-to-float v8, v8

    .line 136
    const/16 v9, 0x3e8

    .line 137
    .line 138
    invoke-virtual {v7, v9, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 139
    .line 140
    .line 141
    iget-object v7, v0, Lio/sentry/android/core/internal/gestures/c;->l:Landroid/view/VelocityTracker;

    .line 142
    .line 143
    invoke-virtual {v7, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    iget-object v8, v0, Lio/sentry/android/core/internal/gestures/c;->l:Landroid/view/VelocityTracker;

    .line 148
    .line 149
    invoke-virtual {v8, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    int-to-float v1, v1

    .line 158
    cmpl-float v8, v8, v1

    .line 159
    .line 160
    if-gtz v8, :cond_8

    .line 161
    .line 162
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    cmpl-float v1, v8, v1

    .line 167
    .line 168
    if-lez v1, :cond_9

    .line 169
    .line 170
    :cond_8
    iget-object v1, v0, Lio/sentry/android/core/internal/gestures/c;->k:Landroid/view/MotionEvent;

    .line 171
    .line 172
    invoke-virtual {v2, v1, p1, v7, v4}, Lio/sentry/android/core/internal/gestures/g;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_1
    invoke-virtual {v0}, Lio/sentry/android/core/internal/gestures/c;->a()V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    iput v1, v0, Lio/sentry/android/core/internal/gestures/c;->g:F

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    iput v1, v0, Lio/sentry/android/core/internal/gestures/c;->h:F

    .line 190
    .line 191
    iget v4, v0, Lio/sentry/android/core/internal/gestures/c;->g:F

    .line 192
    .line 193
    iput v4, v0, Lio/sentry/android/core/internal/gestures/c;->i:F

    .line 194
    .line 195
    iput v1, v0, Lio/sentry/android/core/internal/gestures/c;->j:F

    .line 196
    .line 197
    iput-boolean v6, v0, Lio/sentry/android/core/internal/gestures/c;->e:Z

    .line 198
    .line 199
    iput-boolean v5, v0, Lio/sentry/android/core/internal/gestures/c;->f:Z

    .line 200
    .line 201
    iget-object v1, v0, Lio/sentry/android/core/internal/gestures/c;->k:Landroid/view/MotionEvent;

    .line 202
    .line 203
    if-eqz v1, :cond_b

    .line 204
    .line 205
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 206
    .line 207
    .line 208
    :cond_b
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iput-object v1, v0, Lio/sentry/android/core/internal/gestures/c;->k:Landroid/view/MotionEvent;

    .line 213
    .line 214
    invoke-virtual {v2, p1}, Lio/sentry/android/core/internal/gestures/g;->onDown(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    .line 216
    .line 217
    :cond_c
    :goto_2
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-ne v0, v6, :cond_12

    .line 225
    .line 226
    iget-object p0, p0, Lio/sentry/android/core/internal/gestures/h;->Z:Lio/sentry/android/core/internal/gestures/g;

    .line 227
    .line 228
    const-string v0, "onUp"

    .line 229
    .line 230
    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/g;->b(Ljava/lang/String;)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/g;->g:Lio/sentry/android/core/internal/gestures/f;

    .line 235
    .line 236
    iget-object v2, v1, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/internal/gestures/b;

    .line 237
    .line 238
    if-eqz v0, :cond_12

    .line 239
    .line 240
    if-nez v2, :cond_d

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_d
    iget-object v0, v1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    .line 244
    .line 245
    sget-object v3, Lio/sentry/android/core/internal/gestures/e;->Unknown:Lio/sentry/android/core/internal/gestures/e;

    .line 246
    .line 247
    if-ne v0, v3, :cond_e

    .line 248
    .line 249
    iget-object p0, p0, Lio/sentry/android/core/internal/gestures/g;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 250
    .line 251
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    sget-object p1, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 256
    .line 257
    const-string v0, "Unable to define scroll type. No breadcrumb captured."

    .line 258
    .line 259
    new-array v1, v5, [Ljava/lang/Object;

    .line 260
    .line 261
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    iget v4, v1, Lio/sentry/android/core/internal/gestures/f;->c:F

    .line 270
    .line 271
    sub-float/2addr v0, v4

    .line 272
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    iget v5, v1, Lio/sentry/android/core/internal/gestures/f;->d:F

    .line 277
    .line 278
    sub-float/2addr v4, v5

    .line 279
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    cmpl-float v5, v5, v6

    .line 288
    .line 289
    const/4 v6, 0x0

    .line 290
    if-lez v5, :cond_10

    .line 291
    .line 292
    cmpl-float v0, v0, v6

    .line 293
    .line 294
    if-lez v0, :cond_f

    .line 295
    .line 296
    const-string v0, "right"

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_f
    const-string v0, "left"

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_10
    cmpl-float v0, v4, v6

    .line 303
    .line 304
    if-lez v0, :cond_11

    .line 305
    .line 306
    const-string v0, "down"

    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_11
    const-string v0, "up"

    .line 310
    .line 311
    :goto_3
    iget-object v4, v1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    .line 312
    .line 313
    const-string v5, "direction"

    .line 314
    .line 315
    invoke-static {v5, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {p0, v2, v4, v0, p1}, Lio/sentry/android/core/internal/gestures/g;->a(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/e;Ljava/util/Map;Landroid/view/MotionEvent;)V

    .line 320
    .line 321
    .line 322
    iget-object p1, v1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    .line 323
    .line 324
    invoke-virtual {p0, v2, p1}, Lio/sentry/android/core/internal/gestures/g;->c(Lio/sentry/internal/gestures/b;Lio/sentry/android/core/internal/gestures/e;)V

    .line 325
    .line 326
    .line 327
    const/4 p0, 0x0

    .line 328
    iput-object p0, v1, Lio/sentry/android/core/internal/gestures/f;->b:Lio/sentry/internal/gestures/b;

    .line 329
    .line 330
    iput-object v3, v1, Lio/sentry/android/core/internal/gestures/f;->a:Lio/sentry/android/core/internal/gestures/e;

    .line 331
    .line 332
    iput v6, v1, Lio/sentry/android/core/internal/gestures/f;->c:F

    .line 333
    .line 334
    iput v6, v1, Lio/sentry/android/core/internal/gestures/f;->d:F

    .line 335
    .line 336
    :cond_12
    :goto_4
    return-void

    .line 337
    :goto_5
    :try_start_1
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :catchall_1
    move-exception p1

    .line 342
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    :goto_6
    throw p0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {p0, v0}, Lio/sentry/android/core/internal/gestures/h;->a(Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    iget-object v2, p0, Lio/sentry/android/core/internal/gestures/h;->g0:Lio/sentry/s6;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 24
    .line 25
    const-string v4, "Error dispatching touch event"

    .line 26
    .line 27
    invoke-interface {v2, v3, v4, v1}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    :goto_1
    iget-object p0, p0, Lio/sentry/android/core/internal/gestures/j;->X:Landroid/view/Window$Callback;

    .line 37
    .line 38
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method
