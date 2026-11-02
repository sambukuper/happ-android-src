.class public final Lsj;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsd1;


# instance fields
.field public final a:Ld73;

.field public final b:Lpd5;

.field public final c:Z


# direct methods
.method public constructor <init>(Ld73;Lpd5;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsj;->a:Ld73;

    .line 5
    .line 6
    iput-object p2, p0, Lsj;->b:Lpd5;

    .line 7
    .line 8
    iput-boolean p3, p0, Lsj;->c:Z

    .line 9
    .line 10
    return-void
.end method

.method public static final b(Lsj;Laa6;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Lsj;->a:Ld73;

    .line 2
    .line 3
    iget-boolean v1, p0, Lsj;->c:Z

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw39;->b0(Ld73;Z)Ld73;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lsj;->b:Lpd5;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, v1, v2}, Lwa;->M(Ld73;Lpd5;Z)Landroid/graphics/ImageDecoder$Source;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ld73;->source()Lba0;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    const-wide v2, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    :try_start_1
    invoke-interface {v1, v2, v3}, Lba0;->request(J)Z

    .line 28
    .line 29
    .line 30
    invoke-interface {v1}, Lba0;->c()Li90;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-wide v2, v2, Li90;->Y:J

    .line 35
    .line 36
    long-to-int v2, v2

    .line 37
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_0
    invoke-interface {v1}, Lba0;->c()Li90;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Li90;->F()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    invoke-interface {v1}, Lba0;->c()Li90;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3, v2}, Li90;->read(Ljava/nio/ByteBuffer;)I

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 66
    .line 67
    .line 68
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto :goto_2

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 74
    :catchall_2
    move-exception p1

    .line 75
    :try_start_4
    invoke-static {v1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_1
    :goto_1
    new-instance v2, Lpj;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-direct {v2, p0, p1, v3}, Lpj;-><init>(Lsd1;Laa6;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v2}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-static {v0, p1}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :goto_2
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 95
    :catchall_3
    move-exception p1

    .line 96
    invoke-static {v0, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method


# virtual methods
.method public final a(Lq51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Loj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Loj;

    .line 7
    .line 8
    iget v1, v0, Loj;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loj;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loj;

    .line 21
    .line 22
    check-cast p1, Ls51;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Loj;-><init>(Lsj;Ls51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, Loj;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, Loj;->i0:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x1

    .line 34
    sget-object v5, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Loj;->f0:Laa6;

    .line 43
    .line 44
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    iget-object v1, v0, Loj;->f0:Laa6;

    .line 55
    .line 56
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v7, v1

    .line 60
    move-object v1, p1

    .line 61
    move-object p1, v7

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Laa6;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lp5;

    .line 72
    .line 73
    const/4 v6, 0x5

    .line 74
    invoke-direct {v1, p0, p1, v6}, Lp5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, Loj;->f0:Laa6;

    .line 78
    .line 79
    iput v4, v0, Loj;->i0:I

    .line 80
    .line 81
    new-instance v4, Lpg3;

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-direct {v4, v1, v2, v6}, Lpg3;-><init>(Ldn2;Lq51;B)V

    .line 85
    .line 86
    .line 87
    sget-object v1, Lb02;->X:Lb02;

    .line 88
    .line 89
    invoke-static {v1, v4, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne v1, v5, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    :goto_1
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    iput-object p1, v0, Loj;->f0:Laa6;

    .line 99
    .line 100
    iput v3, v0, Loj;->i0:I

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lsj;->c(Landroid/graphics/drawable/Drawable;Ls51;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v5, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v5

    .line 109
    :cond_5
    move-object v7, p1

    .line 110
    move-object p1, p0

    .line 111
    move-object p0, v7

    .line 112
    :goto_3
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    invoke-static {p1}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iget-boolean p0, p0, Laa6;->X:Z

    .line 119
    .line 120
    new-instance v0, Lnd1;

    .line 121
    .line 122
    invoke-direct {v0, p1, p0}, Lnd1;-><init>(Ld53;Z)V

    .line 123
    .line 124
    .line 125
    return-object v0
.end method

.method public final c(Landroid/graphics/drawable/Drawable;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lqj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqj;

    .line 7
    .line 8
    iget v1, v0, Lqj;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqj;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqj;-><init>(Lsj;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqj;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqj;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    iget-object p0, p0, Lsj;->b:Lpd5;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v2, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Lqj;->f0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    instance-of p2, p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 55
    .line 56
    if-nez p2, :cond_3

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    sget-object p2, Lw63;->a:Lf4;

    .line 60
    .line 61
    invoke-static {p0, p2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v4, -0x2

    .line 72
    if-eq v1, v4, :cond_4

    .line 73
    .line 74
    move-object v1, p1

    .line 75
    check-cast v1, Landroid/graphics/drawable/AnimatedImageDrawable;

    .line 76
    .line 77
    invoke-static {p0, p2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/AnimatedImageDrawable;->setRepeatCount(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    sget-object p2, Lw63;->c:Lf4;

    .line 91
    .line 92
    invoke-static {p0, p2}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, Ldn2;

    .line 97
    .line 98
    sget-object v1, Lw63;->d:Lf4;

    .line 99
    .line 100
    invoke-static {p0, v1}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ldn2;

    .line 105
    .line 106
    if-nez p2, :cond_5

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    :cond_5
    sget-object v4, Ltp1;->a:Lnf1;

    .line 111
    .line 112
    sget-object v4, Ldm4;->a:Lhv2;

    .line 113
    .line 114
    iget-object v4, v4, Lhv2;->h0:Lhv2;

    .line 115
    .line 116
    new-instance v5, Lrj;

    .line 117
    .line 118
    invoke-direct {v5, p1, p2, v1, v3}, Lrj;-><init>(Landroid/graphics/drawable/Drawable;Ldn2;Ldn2;Lq51;)V

    .line 119
    .line 120
    .line 121
    iput-object p1, v0, Lqj;->f0:Ljava/lang/Object;

    .line 122
    .line 123
    iput v2, v0, Lqj;->i0:I

    .line 124
    .line 125
    invoke-static {v4, v5, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget-object v0, Lc71;->X:Lc71;

    .line 130
    .line 131
    if-ne p2, v0, :cond_6

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_6
    :goto_1
    new-instance p2, Lrw6;

    .line 135
    .line 136
    iget-object p0, p0, Lpd5;->c:Lpw6;

    .line 137
    .line 138
    invoke-direct {p2, p1, p0}, Lrw6;-><init>(Landroid/graphics/drawable/Drawable;Lpw6;)V

    .line 139
    .line 140
    .line 141
    return-object p2
.end method
