.class public final Lui3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh96;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lui3;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lui3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final b(Z)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    iget-byte p1, p0, Lui3;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lui3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyi3;

    .line 13
    .line 14
    iget-object p1, p0, Lyi3;->s:Lxb;

    .line 15
    .line 16
    iget-object v0, p0, Lyi3;->x:Landroid/view/GestureDetector;

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget v0, p0, Lyi3;->l:I

    .line 29
    .line 30
    const/4 v1, -0x1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, Lyi3;->l:I

    .line 39
    .line 40
    invoke-virtual {p2, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ltz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v0, v2, p2}, Lyi3;->j(IILandroid/view/MotionEvent;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v3, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x1

    .line 56
    if-eq v0, v5, :cond_8

    .line 57
    .line 58
    const/4 v6, 0x2

    .line 59
    if-eq v0, v6, :cond_7

    .line 60
    .line 61
    const/4 p1, 0x3

    .line 62
    if-eq v0, p1, :cond_6

    .line 63
    .line 64
    const/4 p1, 0x6

    .line 65
    if-eq v0, p1, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v1, p0, Lyi3;->l:I

    .line 77
    .line 78
    if-ne v0, v1, :cond_9

    .line 79
    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    move v4, v5

    .line 83
    :cond_5
    invoke-virtual {p2, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lyi3;->l:I

    .line 88
    .line 89
    iget v0, p0, Lyi3;->o:I

    .line 90
    .line 91
    invoke-virtual {p0, v0, p1, p2}, Lyi3;->r(IILandroid/view/MotionEvent;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    iget-object p1, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 96
    .line 97
    if-eqz p1, :cond_8

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    if-ltz v2, :cond_9

    .line 104
    .line 105
    iget v0, p0, Lyi3;->o:I

    .line 106
    .line 107
    invoke-virtual {p0, v0, v2, p2}, Lyi3;->r(IILandroid/view/MotionEvent;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v3}, Lyi3;->p(Landroidx/recyclerview/widget/l;)V

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    invoke-virtual {p2, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lxb;->run()V

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_8
    :goto_0
    const/4 p1, 0x0

    .line 128
    invoke-virtual {p0, p1, v4}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 129
    .line 130
    .line 131
    iput v1, p0, Lyi3;->l:I

    .line 132
    .line 133
    :cond_9
    :goto_1
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-byte p1, p0, Lui3;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lui3;->b:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Ly42;

    .line 16
    .line 17
    iget-object p1, p0, Ly42;->g:Ljava/util/LinkedList;

    .line 18
    .line 19
    iget v4, p0, Ly42;->e:I

    .line 20
    .line 21
    if-gez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    iget-object v5, p0, Ly42;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_7

    .line 32
    .line 33
    iget-object v5, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-nez v6, :cond_7

    .line 43
    .line 44
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    int-to-float v6, v6

    .line 49
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    cmpg-float v6, v6, v7

    .line 54
    .line 55
    if-gez v6, :cond_5

    .line 56
    .line 57
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    int-to-float v6, v6

    .line 62
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    cmpl-float v6, v6, v7

    .line 67
    .line 68
    if-lez v6, :cond_5

    .line 69
    .line 70
    iget-boolean v6, p0, Ly42;->k:Z

    .line 71
    .line 72
    if-nez v6, :cond_7

    .line 73
    .line 74
    iget-object v6, p0, Ly42;->h:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v6}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    new-instance v7, Lpy7;

    .line 81
    .line 82
    invoke-direct {v7, p2, v4, v3}, Lpy7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v6, v7}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    iget-object v4, p2, Lmd8;->a:Lu27;

    .line 90
    .line 91
    invoke-interface {v4}, Lu27;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_2

    .line 100
    .line 101
    iget-object v6, p2, Lmd8;->b:Lgn2;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-interface {v6, v7}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move-object v7, v6

    .line 112
    check-cast v7, Lqg5;

    .line 113
    .line 114
    iget-object v7, v7, Lqg5;->X:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v7, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_1

    .line 123
    .line 124
    move-object v0, v6

    .line 125
    :cond_2
    check-cast v0, Lqg5;

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    iget-object p2, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p2, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_3

    .line 138
    .line 139
    iget p1, p0, Ly42;->i:I

    .line 140
    .line 141
    add-int/2addr p1, v3

    .line 142
    iput p1, p0, Ly42;->i:I

    .line 143
    .line 144
    iget p1, p0, Ly42;->e:I

    .line 145
    .line 146
    if-le p1, v2, :cond_7

    .line 147
    .line 148
    iput-boolean v3, p0, Ly42;->k:Z

    .line 149
    .line 150
    invoke-virtual {v5}, Landroid/view/View;->requestLayout()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_3
    iget p2, p0, Ly42;->e:I

    .line 158
    .line 159
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-nez p2, :cond_4

    .line 168
    .line 169
    iget p2, p0, Ly42;->e:I

    .line 170
    .line 171
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_4
    iput v1, p0, Ly42;->i:I

    .line 179
    .line 180
    iput v2, p0, Ly42;->e:I

    .line 181
    .line 182
    invoke-virtual {p0}, Ly42;->k()V

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_5
    iget p2, p0, Ly42;->e:I

    .line 187
    .line 188
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-nez p2, :cond_6

    .line 197
    .line 198
    iget p2, p0, Ly42;->e:I

    .line 199
    .line 200
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    :cond_6
    iput v2, p0, Ly42;->e:I

    .line 208
    .line 209
    iput v1, p0, Ly42;->i:I

    .line 210
    .line 211
    invoke-virtual {p0}, Ly42;->k()V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_0
    return v1

    .line 215
    :pswitch_0
    check-cast p0, Lyi3;

    .line 216
    .line 217
    iget-object p1, p0, Lyi3;->x:Landroid/view/GestureDetector;

    .line 218
    .line 219
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-nez p1, :cond_d

    .line 227
    .line 228
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    iput p1, p0, Lyi3;->l:I

    .line 233
    .line 234
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    iput p1, p0, Lyi3;->d:F

    .line 239
    .line 240
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    iput p1, p0, Lyi3;->e:F

    .line 245
    .line 246
    iget-object p1, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 247
    .line 248
    if-eqz p1, :cond_8

    .line 249
    .line 250
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 251
    .line 252
    .line 253
    :cond_8
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    iput-object p1, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 258
    .line 259
    iget-object p1, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 260
    .line 261
    if-nez p1, :cond_10

    .line 262
    .line 263
    iget-object p1, p0, Lyi3;->p:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_9

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_9
    invoke-virtual {p0, p2}, Lyi3;->m(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    sub-int/2addr v4, v3

    .line 281
    :goto_1
    if-ltz v4, :cond_b

    .line 282
    .line 283
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    check-cast v5, Lvi3;

    .line 288
    .line 289
    iget-object v6, v5, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 290
    .line 291
    iget-object v6, v6, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 292
    .line 293
    if-ne v6, v2, :cond_a

    .line 294
    .line 295
    move-object v0, v5

    .line 296
    goto :goto_2

    .line 297
    :cond_a
    add-int/lit8 v4, v4, -0x1

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_b
    :goto_2
    if-eqz v0, :cond_10

    .line 301
    .line 302
    iget-object p1, v0, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 303
    .line 304
    iget v2, p0, Lyi3;->d:F

    .line 305
    .line 306
    iget v4, v0, Lvi3;->i:F

    .line 307
    .line 308
    sub-float/2addr v2, v4

    .line 309
    iput v2, p0, Lyi3;->d:F

    .line 310
    .line 311
    iget v2, p0, Lyi3;->e:F

    .line 312
    .line 313
    iget v4, v0, Lvi3;->j:F

    .line 314
    .line 315
    sub-float/2addr v2, v4

    .line 316
    iput v2, p0, Lyi3;->e:F

    .line 317
    .line 318
    invoke-virtual {p0, p1, v3}, Lyi3;->l(Landroidx/recyclerview/widget/l;Z)V

    .line 319
    .line 320
    .line 321
    iget-object v2, p0, Lyi3;->a:Ljava/util/ArrayList;

    .line 322
    .line 323
    iget-object v4, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    if-eqz v2, :cond_c

    .line 330
    .line 331
    invoke-static {p1}, Ly42;->a(Landroidx/recyclerview/widget/l;)V

    .line 332
    .line 333
    .line 334
    :cond_c
    iget-byte v0, v0, Lvi3;->f:B

    .line 335
    .line 336
    invoke-virtual {p0, p1, v0}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 337
    .line 338
    .line 339
    iget p1, p0, Lyi3;->o:I

    .line 340
    .line 341
    invoke-virtual {p0, p1, v1, p2}, Lyi3;->r(IILandroid/view/MotionEvent;)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_d
    const/4 v4, 0x3

    .line 346
    if-eq p1, v4, :cond_f

    .line 347
    .line 348
    if-ne p1, v3, :cond_e

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_e
    iget v0, p0, Lyi3;->l:I

    .line 352
    .line 353
    if-eq v0, v2, :cond_10

    .line 354
    .line 355
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-ltz v0, :cond_10

    .line 360
    .line 361
    invoke-virtual {p0, p1, v0, p2}, Lyi3;->j(IILandroid/view/MotionEvent;)V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_f
    :goto_3
    iput v2, p0, Lyi3;->l:I

    .line 366
    .line 367
    invoke-virtual {p0, v0, v1}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 368
    .line 369
    .line 370
    :cond_10
    :goto_4
    iget-object p1, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 371
    .line 372
    if-eqz p1, :cond_11

    .line 373
    .line 374
    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 375
    .line 376
    .line 377
    :cond_11
    iget-object p0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 378
    .line 379
    if-eqz p0, :cond_12

    .line 380
    .line 381
    move v1, v3

    .line 382
    :cond_12
    return v1

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lui3;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lui3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyi3;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
