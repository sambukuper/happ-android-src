.class public final Lbl2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final X:Lml2;


# direct methods
.method public constructor <init>(Lml2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbl2;->X:Lml2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    const-class v0, Landroidx/fragment/app/FragmentContainerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lbl2;->X:Lml2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Landroidx/fragment/app/FragmentContainerView;

    .line 16
    .line 17
    invoke-direct {p0, p3, p4, v1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lml2;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "fragment"

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v0, 0x0

    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_1
    const-string p2, "class"

    .line 33
    .line 34
    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    sget-object v2, Le66;->Fragment:[I

    .line 39
    .line 40
    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    sget p2, Le66;->Fragment_android_name:I

    .line 47
    .line 48
    invoke-virtual {v2, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :cond_2
    sget v3, Le66;->Fragment_android_id:I

    .line 53
    .line 54
    const/4 v4, -0x1

    .line 55
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sget v5, Le66;->Fragment_android_tag:I

    .line 60
    .line 61
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    .line 67
    .line 68
    if-eqz p2, :cond_15

    .line 69
    .line 70
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const/4 v6, 0x0

    .line 75
    :try_start_0
    invoke-static {v2, p2}, Lgl2;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-class v7, Lqk2;

    .line 80
    .line 81
    invoke-virtual {v7, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move v2, v6

    .line 87
    :goto_0
    if-nez v2, :cond_3

    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_3
    if-eqz p1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    :cond_4
    if-ne v6, v4, :cond_6

    .line 98
    .line 99
    if-ne v3, v4, :cond_6

    .line 100
    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    new-instance p3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p1, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    .line 119
    .line 120
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_6
    :goto_1
    if-eq v3, v4, :cond_7

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Lml2;->D(I)Lqk2;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    goto :goto_2

    .line 141
    :cond_7
    move-object v2, v0

    .line 142
    :goto_2
    if-nez v2, :cond_8

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    invoke-virtual {v1, v5}, Lml2;->E(Ljava/lang/String;)Lqk2;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :cond_8
    if-nez v2, :cond_9

    .line 151
    .line 152
    if-eq v6, v4, :cond_9

    .line 153
    .line 154
    invoke-virtual {v1, v6}, Lml2;->D(I)Lqk2;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :cond_9
    const/4 v4, 0x2

    .line 159
    const/4 v7, 0x1

    .line 160
    if-nez v2, :cond_d

    .line 161
    .line 162
    invoke-virtual {v1}, Lml2;->I()Lgl2;

    .line 163
    .line 164
    .line 165
    move-result-object p4

    .line 166
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p4, p2}, Lgl2;->a(Ljava/lang/String;)Lqk2;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iput-boolean v7, v2, Lqk2;->p0:Z

    .line 174
    .line 175
    if-eqz v3, :cond_a

    .line 176
    .line 177
    move p3, v3

    .line 178
    goto :goto_3

    .line 179
    :cond_a
    move p3, v6

    .line 180
    :goto_3
    iput p3, v2, Lqk2;->z0:I

    .line 181
    .line 182
    iput v6, v2, Lqk2;->A0:I

    .line 183
    .line 184
    iput-object v5, v2, Lqk2;->B0:Ljava/lang/String;

    .line 185
    .line 186
    iput-boolean v7, v2, Lqk2;->q0:Z

    .line 187
    .line 188
    iput-object v1, v2, Lqk2;->v0:Lml2;

    .line 189
    .line 190
    iget-object p3, v1, Lml2;->w:Ltk2;

    .line 191
    .line 192
    iput-object p3, v2, Lqk2;->w0:Ltk2;

    .line 193
    .line 194
    iget-object p4, p3, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 195
    .line 196
    iput-boolean v7, v2, Lqk2;->H0:Z

    .line 197
    .line 198
    if-nez p3, :cond_b

    .line 199
    .line 200
    move-object p3, v0

    .line 201
    goto :goto_4

    .line 202
    :cond_b
    iget-object p3, p3, Ltk2;->B0:Landroidx/appcompat/app/AppCompatActivity;

    .line 203
    .line 204
    :goto_4
    if-eqz p3, :cond_c

    .line 205
    .line 206
    iput-boolean v7, v2, Lqk2;->H0:Z

    .line 207
    .line 208
    :cond_c
    invoke-virtual {v1, v2}, Lml2;->a(Lqk2;)Lwl2;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-static {v4}, Lml2;->K(I)Z

    .line 213
    .line 214
    .line 215
    move-result p4

    .line 216
    if-eqz p4, :cond_10

    .line 217
    .line 218
    invoke-virtual {v2}, Lqk2;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_d
    iget-boolean p3, v2, Lqk2;->q0:Z

    .line 226
    .line 227
    if-nez p3, :cond_14

    .line 228
    .line 229
    iput-boolean v7, v2, Lqk2;->q0:Z

    .line 230
    .line 231
    iput-object v1, v2, Lqk2;->v0:Lml2;

    .line 232
    .line 233
    iget-object p3, v1, Lml2;->w:Ltk2;

    .line 234
    .line 235
    iput-object p3, v2, Lqk2;->w0:Ltk2;

    .line 236
    .line 237
    iget-object p4, p3, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 238
    .line 239
    iput-boolean v7, v2, Lqk2;->H0:Z

    .line 240
    .line 241
    if-nez p3, :cond_e

    .line 242
    .line 243
    move-object p3, v0

    .line 244
    goto :goto_5

    .line 245
    :cond_e
    iget-object p3, p3, Ltk2;->B0:Landroidx/appcompat/app/AppCompatActivity;

    .line 246
    .line 247
    :goto_5
    if-eqz p3, :cond_f

    .line 248
    .line 249
    iput-boolean v7, v2, Lqk2;->H0:Z

    .line 250
    .line 251
    :cond_f
    invoke-virtual {v1, v2}, Lml2;->h(Lqk2;)Lwl2;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    invoke-static {v4}, Lml2;->K(I)Z

    .line 256
    .line 257
    .line 258
    move-result p4

    .line 259
    if-eqz p4, :cond_10

    .line 260
    .line 261
    invoke-virtual {v2}, Lqk2;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    :cond_10
    :goto_6
    check-cast p1, Landroid/view/ViewGroup;

    .line 268
    .line 269
    sget-object p4, Lam2;->a:Lzl2;

    .line 270
    .line 271
    new-instance p4, Lbm2;

    .line 272
    .line 273
    new-instance v1, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v4, "Attempting to use <fragment> tag to add fragment "

    .line 276
    .line 277
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v4, " to container "

    .line 284
    .line 285
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-direct {p4, v2, v1}, Lky8;-><init>(Lqk2;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-static {p4}, Lam2;->b(Lky8;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v2}, Lam2;->a(Lqk2;)Lzl2;

    .line 302
    .line 303
    .line 304
    move-result-object p4

    .line 305
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iput-object p1, v2, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 309
    .line 310
    invoke-virtual {p3}, Lwl2;->k()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p3}, Lwl2;->j()V

    .line 314
    .line 315
    .line 316
    iget-object p1, v2, Lqk2;->J0:Landroid/view/View;

    .line 317
    .line 318
    if-eqz p1, :cond_13

    .line 319
    .line 320
    if-eqz v3, :cond_11

    .line 321
    .line 322
    invoke-virtual {p1, v3}, Landroid/view/View;->setId(I)V

    .line 323
    .line 324
    .line 325
    :cond_11
    iget-object p1, v2, Lqk2;->J0:Landroid/view/View;

    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    if-nez p1, :cond_12

    .line 332
    .line 333
    iget-object p1, v2, Lqk2;->J0:Landroid/view/View;

    .line 334
    .line 335
    invoke-virtual {p1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :cond_12
    iget-object p1, v2, Lqk2;->J0:Landroid/view/View;

    .line 339
    .line 340
    new-instance p2, Lal2;

    .line 341
    .line 342
    invoke-direct {p2, p0, p3}, Lal2;-><init>(Lbl2;Lwl2;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 346
    .line 347
    .line 348
    iget-object p0, v2, Lqk2;->J0:Landroid/view/View;

    .line 349
    .line 350
    return-object p0

    .line 351
    :cond_13
    const-string p0, "Fragment "

    .line 352
    .line 353
    const-string p1, " did not create a view."

    .line 354
    .line 355
    invoke-static {p0, p2, p1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return-object v0

    .line 363
    :cond_14
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 364
    .line 365
    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p3

    .line 373
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p4

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string p1, ": Duplicate id 0x"

    .line 386
    .line 387
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string p1, ", tag "

    .line 394
    .line 395
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    const-string p1, ", or parent id 0x"

    .line 402
    .line 403
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string p1, " with another fragment for "

    .line 410
    .line 411
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw p0

    .line 425
    :cond_15
    :goto_7
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 426
    invoke-virtual {p0, v0, p1, p2, p3}, Lbl2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method
