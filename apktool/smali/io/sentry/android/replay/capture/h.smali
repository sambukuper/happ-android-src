.class public final Lio/sentry/android/replay/capture/h;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Lio/sentry/i1;Lio/sentry/s6;JLjava/util/Date;Lio/sentry/protocol/w;IIILio/sentry/t6;Lio/sentry/android/replay/l;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;Ljava/util/List;Ljava/util/List;)Lio/sentry/android/replay/capture/k;
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    move/from16 v3, p6

    move-object/from16 v10, p10

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v10, :cond_27

    .line 1
    iget-object v12, v10, Lio/sentry/android/replay/l;->X:Lio/sentry/s6;

    const-wide/32 v4, 0x493e0

    move-wide/from16 v6, p2

    .line 2
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    .line 3
    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    move-wide v6, v4

    .line 4
    new-instance v5, Ljava/io/File;

    invoke-virtual {v10}, Lio/sentry/android/replay/l;->m()Ljava/io/File;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ".mp4"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 5
    iget-object v15, v10, Lio/sentry/android/replay/l;->g0:Lio/sentry/util/a;

    iget-object v4, v10, Lio/sentry/android/replay/l;->j0:Ljava/util/ArrayList;

    .line 6
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v16, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v8

    cmp-long v0, v8, v16

    if-lez v0, :cond_0

    .line 7
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 8
    :cond_0
    invoke-virtual {v15}, Lio/sentry/util/a;->g()V

    :try_start_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    if-eqz v0, :cond_1

    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v4, v15

    goto/16 :goto_15

    :cond_1
    :try_start_2
    invoke-static {v4}, Lwv0;->Z0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    goto :goto_0

    :goto_1
    const/4 v9, 0x0

    invoke-static {v15, v9}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 9
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    move-wide/from16 p2, v13

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v12}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    const-string v5, "No captured frames, skipping generating a video segment"

    new-array v6, v13, [Ljava/lang/Object;

    invoke-interface {v0, v4, v5, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    move/from16 v8, p11

    move-object v6, v9

    goto/16 :goto_d

    .line 11
    :cond_2
    new-instance v13, Lio/sentry/android/core/d;

    move-object/from16 v18, v4

    .line 12
    new-instance v4, Lio/sentry/android/replay/video/a;

    move-wide/from16 v19, v6

    move-object/from16 v21, v8

    move-object v11, v9

    move/from16 v7, p7

    move/from16 v6, p8

    move/from16 v8, p11

    move/from16 v9, p12

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/replay/video/a;-><init>(Ljava/io/File;IIII)V

    .line 13
    invoke-direct {v13, v12, v4}, Lio/sentry/android/core/d;-><init>(Lio/sentry/s6;Lio/sentry/android/replay/video/a;)V

    .line 14
    :try_start_3
    iget-object v0, v13, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/media/MediaCodec;

    .line 15
    iget-object v4, v13, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    check-cast v4, Lg44;

    .line 16
    invoke-interface {v4}, Lg44;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/MediaFormat;

    .line 17
    invoke-virtual {v0, v4, v11, v11, v14}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 18
    invoke-virtual {v0}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v4

    iput-object v4, v13, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 19
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    const/4 v4, 0x0

    .line 20
    invoke-virtual {v13, v4}, Lio/sentry/android/core/d;->c(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 21
    iput-object v13, v10, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    move-object v4, v12

    int-to-long v11, v8

    const-wide/16 v22, 0x3e8

    .line 22
    div-long v11, v22, v11

    .line 23
    invoke-static/range {v21 .. v21}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v15

    move-wide/from16 v14, v19

    add-long v9, v14, p2

    const-wide/high16 v19, -0x8000000000000000L

    cmp-long v13, v9, v19

    if-gtz v13, :cond_3

    .line 24
    sget-object v13, Lni4;->f0:Lni4;

    goto :goto_2

    .line 25
    :cond_3
    new-instance v13, Lni4;

    const-wide/16 v19, 0x1

    sub-long v6, v9, v19

    invoke-direct {v13, v14, v15, v6, v7}, Lni4;-><init>(JJ)V

    .line 26
    :goto_2
    invoke-static {v11, v12, v13}, Lx97;->X(JLni4;)Lli4;

    move-result-object v6

    .line 27
    iget-wide v13, v6, Lli4;->X:J

    move-wide/from16 p2, v11

    .line 28
    iget-wide v11, v6, Lli4;->Y:J

    .line 29
    iget-wide v6, v6, Lli4;->Z:J

    cmp-long v15, v6, v16

    if-lez v15, :cond_4

    cmp-long v19, v13, v11

    if-lez v19, :cond_5

    :cond_4
    if-gez v15, :cond_d

    cmp-long v15, v11, v13

    if-gtz v15, :cond_d

    :cond_5
    const/4 v15, 0x0

    .line 30
    :goto_3
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .line 31
    :goto_4
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_8

    .line 32
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v26, v0

    move-object/from16 v0, v20

    check-cast v0, Lio/sentry/android/replay/m;

    add-long v27, v13, p2

    move-wide/from16 v29, v6

    .line 33
    iget-wide v6, v0, Lio/sentry/android/replay/m;->b:J

    cmp-long v20, v13, v6

    if-gtz v20, :cond_6

    cmp-long v20, v6, v27

    if-gtz v20, :cond_6

    move-object v6, v0

    goto :goto_6

    :cond_6
    cmp-long v0, v6, v27

    if-lez v0, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v0, v26

    move-wide/from16 v6, v29

    goto :goto_4

    :cond_8
    move-object/from16 v26, v0

    move-wide/from16 v29, v6

    :goto_5
    move-object/from16 v6, v26

    .line 34
    :goto_6
    move-object v0, v6

    check-cast v0, Lio/sentry/android/replay/m;

    if-nez v0, :cond_9

    move-object/from16 v7, p10

    move-object/from16 v19, v4

    move-wide/from16 v26, v11

    goto :goto_9

    .line 35
    :cond_9
    :try_start_4
    iget-object v0, v0, Lio/sentry/android/replay/m;->a:Ljava/io/File;

    .line 36
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v7, p10

    move-object/from16 v19, v4

    .line 37
    :try_start_5
    iget-object v4, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    if-eqz v4, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v0}, Lio/sentry/android/core/d;->d(Landroid/graphics/Bitmap;)V

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_8

    .line 38
    :cond_a
    :goto_7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    add-int/lit8 v15, v15, 0x1

    move-object v0, v6

    move-wide/from16 v26, v11

    move-object/from16 v11, v21

    move-object/from16 v4, v25

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object/from16 v7, p10

    move-object/from16 v19, v4

    .line 39
    :goto_8
    invoke-virtual/range {v19 .. v19}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    move-wide/from16 v26, v11

    .line 40
    sget-object v11, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 41
    const-string v12, "Unable to decode bitmap and encode it into a video, skipping frame"

    .line 42
    invoke-interface {v4, v11, v12, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    if-eqz v6, :cond_b

    .line 43
    move-object v0, v6

    check-cast v0, Lio/sentry/android/replay/m;

    .line 44
    iget-object v0, v0, Lio/sentry/android/replay/m;->a:Ljava/io/File;

    .line 45
    invoke-virtual {v7, v0}, Lio/sentry/android/replay/l;->k(Ljava/io/File;)V

    .line 46
    invoke-virtual/range {v25 .. v25}, Lio/sentry/util/a;->g()V

    :try_start_6
    invoke-static/range {v18 .. v18}, Lci8;->d(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object/from16 v4, v25

    const/4 v11, 0x0

    invoke-static {v4, v11}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    move-object/from16 v11, v21

    .line 47
    invoke-interface {v11, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    goto :goto_a

    :catchall_3
    move-exception v0

    move-object/from16 v4, v25

    move-object v1, v0

    .line 48
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v0

    invoke-static {v4, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_b
    move-object/from16 v11, v21

    move-object/from16 v4, v25

    move-object v0, v6

    :goto_a
    cmp-long v6, v13, v26

    if-eqz v6, :cond_c

    add-long v13, v13, v29

    move-object/from16 v25, v4

    move-object/from16 v21, v11

    move-object/from16 v4, v19

    move-wide/from16 v11, v26

    move-wide/from16 v6, v29

    goto/16 :goto_3

    :cond_c
    move v4, v15

    goto :goto_b

    :cond_d
    move-object/from16 v7, p10

    move-object/from16 v19, v4

    const/4 v4, 0x0

    :goto_b
    if-nez v4, :cond_f

    .line 49
    invoke-virtual/range {v19 .. v19}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v4, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    const-string v6, "Generated a video with no frames, not capturing a replay segment"

    const/4 v9, 0x0

    new-array v10, v9, [Ljava/lang/Object;

    invoke-interface {v0, v4, v6, v10}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lio/sentry/android/core/d;->f()V

    :cond_e
    const/4 v11, 0x0

    .line 51
    iput-object v11, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    .line 52
    invoke-virtual {v7, v5}, Lio/sentry/android/replay/l;->k(Ljava/io/File;)V

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_d

    .line 53
    :cond_f
    iget-object v0, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lio/sentry/android/core/d;->f()V

    .line 54
    :cond_10
    iget-object v0, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    if-eqz v0, :cond_12

    .line 55
    iget-object v0, v0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/b;

    .line 56
    iget v6, v0, Lio/sentry/android/replay/video/b;->e:I

    if-nez v6, :cond_11

    goto :goto_c

    .line 57
    :cond_11
    iget-wide v12, v0, Lio/sentry/android/replay/video/b;->f:J

    iget-wide v14, v0, Lio/sentry/android/replay/video/b;->a:J

    add-long/2addr v12, v14

    div-long v16, v12, v22

    :cond_12
    :goto_c
    move-wide/from16 v11, v16

    const/4 v6, 0x0

    .line 58
    iput-object v6, v7, Lio/sentry/android/replay/l;->h0:Lio/sentry/android/core/d;

    .line 59
    invoke-virtual {v7, v9, v10}, Lio/sentry/android/replay/l;->u(J)Ljava/lang/String;

    .line 60
    new-instance v9, Lio/sentry/android/replay/e;

    invoke-direct {v9, v5, v4, v11, v12}, Lio/sentry/android/replay/e;-><init>(Ljava/io/File;IJ)V

    :goto_d
    if-nez v9, :cond_13

    goto/16 :goto_16

    .line 61
    :cond_13
    iget-object v0, v9, Lio/sentry/android/replay/e;->a:Ljava/io/File;

    .line 62
    iget v4, v9, Lio/sentry/android/replay/e;->b:I

    .line 63
    iget-wide v9, v9, Lio/sentry/android/replay/e;->c:J

    if-nez p14, :cond_15

    .line 64
    new-instance v5, Lea6;

    .line 65
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 66
    sget-object v7, Ld02;->X:Ld02;

    iput-object v7, v5, Lea6;->X:Ljava/lang/Object;

    if-eqz v1, :cond_14

    .line 67
    new-instance v7, Lio/sentry/android/replay/n;

    const/4 v11, 0x1

    invoke-direct {v7, v5, v11}, Lio/sentry/android/replay/n;-><init>(Lea6;B)V

    .line 68
    invoke-interface {v1, v7}, Lio/sentry/i1;->o(Lio/sentry/l4;)V

    .line 69
    :cond_14
    iget-object v1, v5, Lea6;->X:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_e

    :cond_15
    move-object/from16 v1, p14

    .line 70
    :goto_e
    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    add-long/2addr v11, v9

    .line 71
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 72
    new-instance v7, Lio/sentry/u6;

    invoke-direct {v7}, Lio/sentry/u6;-><init>()V

    .line 73
    iput-object v2, v7, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 74
    iput-object v2, v7, Lio/sentry/u6;->u0:Lio/sentry/protocol/w;

    .line 75
    iput v3, v7, Lio/sentry/u6;->v0:I

    .line 76
    iput-object v5, v7, Lio/sentry/u6;->w0:Ljava/util/Date;

    move-object/from16 v2, p4

    .line 77
    iput-object v2, v7, Lio/sentry/u6;->x0:Ljava/util/Date;

    move-object/from16 v11, p9

    .line 78
    iput-object v11, v7, Lio/sentry/u6;->t0:Lio/sentry/t6;

    .line 79
    iput-object v0, v7, Lio/sentry/u6;->r0:Ljava/io/File;

    move-object/from16 v11, p16

    .line 80
    iput-object v11, v7, Lio/sentry/u6;->A0:Ljava/util/List;

    move-object/from16 v11, p17

    .line 81
    iput-object v11, v7, Lio/sentry/u6;->B0:Ljava/util/List;

    .line 82
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 83
    new-instance v12, Lio/sentry/rrweb/j;

    invoke-direct {v12}, Lio/sentry/rrweb/j;-><init>()V

    .line 84
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    .line 85
    iput-wide v13, v12, Lio/sentry/rrweb/b;->Y:J

    move/from16 v13, p7

    .line 86
    iput v13, v12, Lio/sentry/rrweb/j;->f0:I

    move/from16 v14, p8

    .line 87
    iput v14, v12, Lio/sentry/rrweb/j;->g0:I

    .line 88
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v12, Lio/sentry/rrweb/m;

    invoke-direct {v12}, Lio/sentry/rrweb/m;-><init>()V

    move-object/from16 p0, v7

    .line 90
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 91
    iput-wide v6, v12, Lio/sentry/rrweb/b;->Y:J

    .line 92
    iput v3, v12, Lio/sentry/rrweb/m;->f0:I

    .line 93
    iput-wide v9, v12, Lio/sentry/rrweb/m;->h0:J

    .line 94
    iput v4, v12, Lio/sentry/rrweb/m;->m0:I

    .line 95
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 96
    iput-wide v6, v12, Lio/sentry/rrweb/m;->g0:J

    .line 97
    iput v8, v12, Lio/sentry/rrweb/m;->o0:I

    .line 98
    iput v13, v12, Lio/sentry/rrweb/m;->k0:I

    .line 99
    iput v14, v12, Lio/sentry/rrweb/m;->l0:I

    const/4 v4, 0x0

    .line 100
    iput v4, v12, Lio/sentry/rrweb/m;->p0:I

    .line 101
    iput v4, v12, Lio/sentry/rrweb/m;->q0:I

    .line 102
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 104
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v9, 0x0

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/g;

    if-eqz v9, :cond_17

    .line 105
    iget-object v7, v9, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 106
    const-string v8, "network.event"

    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 107
    invoke-virtual {v9}, Lio/sentry/g;->b()Ljava/util/Map;

    move-result-object v7

    .line 108
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "action"

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_16

    const/4 v9, 0x0

    :cond_16
    const-string v7, "NETWORK_AVAILABLE"

    invoke-static {v9, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 109
    iget-object v7, v6, Lio/sentry/g;->i0:Ljava/lang/String;

    .line 110
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 111
    invoke-virtual {v6}, Lio/sentry/g;->b()Ljava/util/Map;

    move-result-object v7

    .line 112
    const-string v8, "network_type"

    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    .line 113
    invoke-virtual {v6}, Lio/sentry/g;->c()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    const-wide/16 v9, 0x1388

    add-long/2addr v7, v9

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_17

    const/4 v7, 0x1

    goto :goto_10

    :cond_17
    move v7, v4

    .line 114
    :goto_10
    invoke-virtual {v6}, Lio/sentry/g;->c()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    cmp-long v8, v8, v12

    if-gez v8, :cond_18

    if-eqz v7, :cond_1d

    .line 115
    :cond_18
    invoke-virtual {v6}, Lio/sentry/g;->c()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-gez v7, :cond_1d

    .line 116
    invoke-virtual/range {p1 .. p1}, Lio/sentry/s6;->getReplayController()Lio/sentry/d4;

    move-result-object v7

    invoke-interface {v7}, Lio/sentry/d4;->Y()Lio/sentry/c4;

    move-result-object v7

    invoke-interface {v7, v6}, Lio/sentry/c4;->a(Lio/sentry/g;)Lio/sentry/rrweb/b;

    move-result-object v7

    if-eqz v7, :cond_1d

    .line 117
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    instance-of v8, v7, Lio/sentry/rrweb/a;

    if-eqz v8, :cond_19

    move-object v9, v7

    check-cast v9, Lio/sentry/rrweb/a;

    goto :goto_11

    :cond_19
    const/4 v9, 0x0

    :goto_11
    if-eqz v9, :cond_1a

    .line 119
    iget-object v9, v9, Lio/sentry/rrweb/a;->h0:Ljava/lang/String;

    goto :goto_12

    :cond_1a
    const/4 v9, 0x0

    .line 120
    :goto_12
    const-string v8, "navigation"

    invoke-static {v9, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    .line 121
    check-cast v7, Lio/sentry/rrweb/a;

    .line 122
    iget-object v8, v7, Lio/sentry/rrweb/a;->k0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 123
    const-string v9, "to"

    if-eqz v8, :cond_1b

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_1c

    :cond_1b
    const/4 v8, 0x0

    :cond_1c
    instance-of v8, v8, Ljava/lang/String;

    if-eqz v8, :cond_1d

    .line 124
    iget-object v7, v7, Lio/sentry/rrweb/a;->k0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_1d
    move-object v9, v6

    goto/16 :goto_f

    :cond_1e
    if-eqz p13, :cond_1f

    .line 126
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v4, p13

    invoke-static {v1, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    .line 127
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 128
    :cond_1f
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 129
    invoke-interface/range {p15 .. p15}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    :cond_20
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/rrweb/b;

    .line 132
    iget-wide v7, v6, Lio/sentry/rrweb/b;->Y:J

    cmp-long v9, v7, v4

    if-gez v9, :cond_20

    .line 133
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_21

    .line 134
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_13

    :cond_22
    if-nez v3, :cond_26

    .line 136
    new-instance v1, Lio/sentry/rrweb/k;

    .line 137
    sget-object v2, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {v1, v2}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    .line 138
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lio/sentry/rrweb/k;->f0:Ljava/util/HashMap;

    .line 139
    const-string v4, "options"

    iput-object v4, v1, Lio/sentry/rrweb/k;->Z:Ljava/lang/String;

    .line 140
    invoke-virtual/range {p1 .. p1}, Lio/sentry/s6;->getSdkVersion()Lio/sentry/protocol/u;

    move-result-object v4

    if-eqz v4, :cond_23

    .line 141
    const-string v5, "nativeSdkName"

    .line 142
    iget-object v6, v4, Lio/sentry/protocol/u;->X:Ljava/lang/String;

    .line 143
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-string v5, "nativeSdkVersion"

    .line 145
    iget-object v4, v4, Lio/sentry/protocol/u;->Y:Ljava/lang/String;

    .line 146
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_23
    invoke-virtual/range {p1 .. p1}, Lio/sentry/s6;->getSessionReplay()Lio/sentry/w6;

    move-result-object v4

    .line 148
    iget-object v5, v4, Lio/sentry/w6;->e:Ljava/lang/Double;

    iget-object v6, v4, Lv3;->a:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 149
    const-string v7, "errorSampleRate"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const-string v5, "sessionSampleRate"

    .line 151
    iget-object v7, v4, Lio/sentry/w6;->d:Ljava/lang/Double;

    .line 152
    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    const-string v5, "android.widget.ImageView"

    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 154
    const-string v7, "maskAllImages"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    const-string v5, "android.widget.TextView"

    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 156
    const-string v7, "maskAllText"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    iget-object v5, v4, Lio/sentry/w6;->f:Lio/sentry/v6;

    .line 158
    invoke-virtual {v5}, Lio/sentry/v6;->serializedName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "quality"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    const-string v5, "maskedViewClasses"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-object v5, v4, Lv3;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 161
    const-string v6, "unmaskedViewClasses"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    iget-object v5, v4, Lio/sentry/w6;->n:Lio/sentry/q4;

    .line 163
    sget-object v6, Lio/sentry/q4;->PIXEL_COPY:Lio/sentry/q4;

    if-ne v5, v6, :cond_24

    .line 164
    const-string v5, "pixelCopy"

    goto :goto_14

    .line 165
    :cond_24
    const-string v5, "canvas"

    .line 166
    :goto_14
    const-string v6, "screenshotStrategy"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    iget-object v5, v4, Lio/sentry/w6;->p:Ljava/util/List;

    .line 168
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const/16 v24, 0x1

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 169
    const-string v6, "networkDetailHasUrls"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    iget-object v5, v4, Lio/sentry/w6;->p:Ljava/util/List;

    .line 171
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    .line 172
    const-string v5, "networkDetailAllowUrls"

    .line 173
    iget-object v6, v4, Lio/sentry/w6;->p:Ljava/util/List;

    .line 174
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v5, "networkRequestHeaders"

    .line 176
    iget-object v6, v4, Lio/sentry/w6;->s:Ljava/util/List;

    .line 177
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v5, "networkResponseHeaders"

    .line 179
    iget-object v6, v4, Lio/sentry/w6;->t:Ljava/util/List;

    .line 180
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    iget-boolean v5, v4, Lio/sentry/w6;->r:Z

    .line 182
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "networkCaptureBodies"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    iget-object v5, v4, Lio/sentry/w6;->q:Ljava/util/List;

    .line 184
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    .line 185
    const-string v5, "networkDetailDenyUrls"

    .line 186
    iget-object v4, v4, Lio/sentry/w6;->q:Ljava/util/List;

    .line 187
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    :cond_25
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    :cond_26
    new-instance v1, Lio/sentry/f4;

    .line 190
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 191
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 192
    iput-object v2, v1, Lio/sentry/f4;->X:Ljava/lang/Integer;

    .line 193
    new-instance v2, Lio/sentry/android/replay/capture/g;

    .line 194
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 195
    invoke-static {v11, v2}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 196
    iput-object v2, v1, Lio/sentry/f4;->Y:Ljava/util/List;

    move-object/from16 v2, p0

    .line 197
    iput-object v0, v2, Lio/sentry/u6;->y0:Ljava/util/List;

    .line 198
    new-instance v0, Lio/sentry/android/replay/capture/i;

    invoke-direct {v0, v2, v1}, Lio/sentry/android/replay/capture/i;-><init>(Lio/sentry/u6;Lio/sentry/f4;)V

    return-object v0

    :catchall_5
    move-exception v0

    .line 199
    invoke-virtual {v13}, Lio/sentry/android/core/d;->f()V

    .line 200
    throw v0

    :catchall_6
    move-exception v0

    move-object v4, v15

    move-object v1, v0

    .line 201
    :goto_15
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    :catchall_7
    move-exception v0

    invoke-static {v4, v1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    .line 202
    :cond_27
    :goto_16
    sget-object v0, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/android/replay/capture/j;

    return-object v0
.end method
