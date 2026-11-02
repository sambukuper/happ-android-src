.class public abstract Lw79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv02;


# static fields
.field public static final a:Lzy0;

.field public static final b:Lpn3;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/lang/Object;

.field public static final f:Ljava/lang/Object;

.field public static final g:Ljava/lang/Object;

.field public static h:Lg73;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldx0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ldx0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lzy0;

    .line 8
    .line 9
    const v2, 0x10c487c

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v3, v0}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lw79;->a:Lzy0;

    .line 17
    .line 18
    new-instance v0, Lpn3;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, v1}, Lpn3;-><init>(B)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lw79;->b:Lpn3;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lw79;->c:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Ljava/lang/Object;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lw79;->d:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/Object;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lw79;->e:Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v0, Ljava/lang/Object;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lw79;->f:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v0, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lw79;->g:Ljava/lang/Object;

    .line 60
    .line 61
    return-void
.end method

.method public static final A(Lt14;)Lt14;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lw79;->F(Lt14;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ltg7;->p:Lfk2;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lsm;->p(Lfk2;)Lgm;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lw79;->o(Lt14;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lni8;

    .line 32
    .line 33
    invoke-virtual {p0}, Lni8;->b()Lt14;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final B(ILlp2;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lpc;->a:Lox1;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lpc;->b:Lox1;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final C(Lt14;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lw79;->F(Lt14;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0}, Lw79;->o(Lt14;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p0}, Lw79;->F(Lt14;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v2, Ltg7;->p:Lfk2;

    .line 27
    .line 28
    invoke-interface {p0, v2}, Lsm;->p(Lfk2;)Lgm;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    move p0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    :goto_0
    add-int/2addr p0, v1

    .line 38
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int/2addr v1, v3

    .line 43
    invoke-interface {v0, p0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static final D(Lg48;II)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lg48;->g0:Z

    .line 3
    .line 4
    iget-object v1, p0, Lg48;->j0:Lf88;

    .line 5
    .line 6
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const-string p2, ""

    .line 15
    .line 16
    invoke-virtual {p0, v2, p1, p2}, Lg48;->c(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-wide v3, v1, Lf88;->a:J

    .line 22
    .line 23
    invoke-static {v3, v4, v2, p1, v0}, Lmn7;->c(JIII)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {p1, p2}, Lf88;->b(J)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lg48;->f(Lf88;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-static {p1, p2}, Lf88;->d(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {p1, p2}, Lf88;->c(J)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p0, v0, p1, v1}, Lg48;->e(IILjava/util/List;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public static final E(Lg48;IILjava/lang/CharSequence;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lg48;->Z:Lmi5;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x0

    .line 12
    move v3, v1

    .line 13
    :goto_0
    if-ge v3, p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge p2, v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p3, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v0, v3}, Lmi5;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ne v2, v4, :cond_0

    .line 30
    .line 31
    add-int/lit8 p2, p2, 0x1

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    move v4, p1

    .line 41
    :goto_1
    if-le v4, v3, :cond_1

    .line 42
    .line 43
    if-le v2, p2, :cond_1

    .line 44
    .line 45
    add-int/lit8 p1, v2, -0x1

    .line 46
    .line 47
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    add-int/lit8 v5, v4, -0x1

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Lmi5;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne p1, v5, :cond_1

    .line 58
    .line 59
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    add-int/lit8 v4, v4, -0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    if-ne v3, v4, :cond_3

    .line 65
    .line 66
    if-eq p2, v2, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 p1, 0x0

    .line 70
    invoke-virtual {p0, p1}, Lg48;->f(Lf88;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lg48;->l0:Lqg5;

    .line 74
    .line 75
    move-object v2, p0

    .line 76
    goto :goto_4

    .line 77
    :cond_3
    :goto_2
    if-nez p2, :cond_4

    .line 78
    .line 79
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-ne v2, p1, :cond_4

    .line 84
    .line 85
    move-object v5, p3

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    invoke-interface {p3, p2, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    move-object v5, p1

    .line 92
    :goto_3
    const/4 v7, 0x0

    .line 93
    const/16 v8, 0x18

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    move-object v2, p0

    .line 97
    invoke-static/range {v2 .. v8}, Lg48;->d(Lg48;IILjava/lang/CharSequence;IZI)V

    .line 98
    .line 99
    .line 100
    :goto_4
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    add-int/2addr p0, v1

    .line 105
    invoke-static {p0, p0}, Lct7;->c(II)J

    .line 106
    .line 107
    .line 108
    move-result-wide p0

    .line 109
    invoke-virtual {v2, p0, p1}, Lg48;->g(J)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static final F(Lt14;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Llh8;->x()Lot0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    instance-of v0, p0, Lsx4;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p0}, Lzz3;->K(Led1;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget v0, Lel1;->a:I

    .line 28
    .line 29
    invoke-static {p0}, Lbl1;->f(Led1;)Lgk2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lw79;->x(Lgk2;)Lso2;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_1
    sget-object v0, Loo2;->d:Loo2;

    .line 41
    .line 42
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    sget-object v0, Lro2;->d:Lro2;

    .line 49
    .line 50
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    :cond_2
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_3
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public static final G(F)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 v0, 0x3f000000    # 0.5f

    .line 12
    .line 13
    cmpg-float p0, p0, v0

    .line 14
    .line 15
    if-gez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static H(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-ne p0, v1, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    const/4 v0, 0x2

    .line 10
    if-ne p0, v0, :cond_2

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_2
    const/4 v0, 0x4

    .line 14
    if-ne p0, v0, :cond_3

    .line 15
    .line 16
    :goto_0
    return v1

    .line 17
    :cond_3
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final I(Lt14;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Llh8;->x()Lot0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    instance-of v1, p0, Lsx4;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p0}, Lzz3;->K(Led1;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget v0, Lel1;->a:I

    .line 28
    .line 29
    invoke-static {p0}, Lbl1;->f(Led1;)Lgk2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lw79;->x(Lgk2;)Lso2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_2
    :goto_0
    sget-object p0, Lro2;->d:Lro2;

    .line 41
    .line 42
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public static final J(Lkx4;Ljw3;Ls64;Lsd5;Z)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Lt64;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lt64;-><init>(Ldn2;Ls64;Lsd5;Z)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static K(Landroid/os/Parcelable;)[B
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-interface {p0, v0, v1}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public static M(I)Lvx;
    .locals 5

    .line 1
    const/4 v0, 0x6

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x2

    .line 7
    if-ne p0, v1, :cond_1

    .line 8
    .line 9
    :goto_0
    move v0, v2

    .line 10
    goto :goto_2

    .line 11
    :cond_1
    if-ne p0, v2, :cond_2

    .line 12
    .line 13
    :goto_1
    move v0, v1

    .line 14
    goto :goto_2

    .line 15
    :cond_2
    const/4 v1, 0x5

    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p0, v3, :cond_3

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_3
    const/4 v4, 0x4

    .line 21
    if-ne p0, v4, :cond_4

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_2

    .line 25
    :cond_4
    if-ne p0, v1, :cond_5

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_5
    if-ne p0, v0, :cond_6

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_6
    const/4 v1, 0x7

    .line 32
    if-ne p0, v1, :cond_7

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_7
    const/16 v2, 0x8

    .line 36
    .line 37
    if-ne p0, v2, :cond_8

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_8
    const/16 v2, 0x9

    .line 41
    .line 42
    if-ne p0, v2, :cond_9

    .line 43
    .line 44
    move v0, v4

    .line 45
    goto :goto_2

    .line 46
    :cond_9
    const/16 v2, 0xa

    .line 47
    .line 48
    if-ne p0, v2, :cond_a

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_a
    const/16 v1, 0xb

    .line 52
    .line 53
    if-ne p0, v1, :cond_b

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_b
    const/16 v1, 0xc

    .line 57
    .line 58
    if-ne p0, v1, :cond_c

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_c
    const/16 v1, 0xd

    .line 62
    .line 63
    if-ne p0, v1, :cond_d

    .line 64
    .line 65
    :goto_2
    new-instance p0, Lvx;

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lvx;-><init>(I)V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_d
    const-string v0, "Unexpected CameraError: "

    .line 72
    .line 73
    invoke-static {p0}, Lai0;->a(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p0, v0}, Lio/sentry/util/c;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static N(Lyo1;Lpw6;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lwo1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lwo1;

    .line 6
    .line 7
    iget p0, p0, Lwo1;->a:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    if-ne p0, p1, :cond_1

    .line 18
    .line 19
    const p0, 0x7fffffff

    .line 20
    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_2
    const/high16 p0, -0x80000000

    .line 29
    .line 30
    return p0
.end method

.method public static O([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static final P(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final Q(Ly07;ILkx6;)V
    .locals 9

    .line 1
    new-instance v0, Lc15;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Ly07;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v2, v1}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2, v2}, Ly07;->i(ZZ)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    iget v1, v0, Lc15;->Z:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lc15;->d(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_1
    iget p0, v0, Lc15;->Z:I

    .line 21
    .line 22
    if-eqz p0, :cond_7

    .line 23
    .line 24
    add-int/lit8 p0, p0, -0x1

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lc15;->k(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ly07;

    .line 31
    .line 32
    invoke-static {p0}, Ljm4;->L(Ly07;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iget-object v3, p0, Ly07;->d:Lt07;

    .line 37
    .line 38
    iget-object v4, v3, Lt07;->X:Ls05;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    sget-object v1, Lc17;->j:Le17;

    .line 43
    .line 44
    invoke-virtual {v4, v1}, Ls05;->c(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0}, Ly07;->d()Li55;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    invoke-static {v1, v5}, Ljm4;->r(Ly24;Z)Ls86;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Los4;->L(Ls86;)Llf3;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget v7, v6, Llf3;->a:I

    .line 67
    .line 68
    iget v8, v6, Llf3;->c:I

    .line 69
    .line 70
    if-ge v7, v8, :cond_0

    .line 71
    .line 72
    iget v7, v6, Llf3;->b:I

    .line 73
    .line 74
    iget v8, v6, Llf3;->d:I

    .line 75
    .line 76
    if-lt v7, v8, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object v7, Ls07;->e:Le17;

    .line 80
    .line 81
    iget-object v3, v3, Lt07;->X:Ls05;

    .line 82
    .line 83
    invoke-virtual {v3, v7}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const/4 v7, 0x0

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    move-object v3, v7

    .line 91
    :cond_3
    check-cast v3, Lrn2;

    .line 92
    .line 93
    sget-object v8, Lc17;->w:Le17;

    .line 94
    .line 95
    invoke-virtual {v4, v8}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v7, v4

    .line 103
    :goto_2
    check-cast v7, Ljx6;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    if-eqz v7, :cond_5

    .line 108
    .line 109
    iget-object v3, v7, Ljx6;->b:Ldn2;

    .line 110
    .line 111
    invoke-interface {v3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    const/4 v4, 0x0

    .line 122
    cmpl-float v3, v3, v4

    .line 123
    .line 124
    if-lez v3, :cond_5

    .line 125
    .line 126
    add-int/2addr v5, p1

    .line 127
    new-instance v3, Llx6;

    .line 128
    .line 129
    invoke-direct {v3, p0, v5, v6, v1}, Llx6;-><init>(Ly07;ILlf3;Li55;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v3}, Lkx6;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {p0, v5, p2}, Lw79;->Q(Ly07;ILkx6;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    invoke-virtual {p0, v2, v2}, Ly07;->i(ZZ)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_6
    const-string p0, "Expected semantics node to have a coordinator."

    .line 146
    .line 147
    invoke-static {p0}, Lp61;->j(Ljava/lang/String;)Lo14;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    throw p0

    .line 152
    :cond_7
    return-void
.end method

.method public static final a(Lkx4;Lrn2;Lzy0;Llp2;I)V
    .locals 11

    .line 1
    const v0, -0x7f96e8c7

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p4

    .line 23
    :goto_1
    or-int/lit8 v0, v0, 0x30

    .line 24
    .line 25
    and-int/lit16 v1, p4, 0x180

    .line 26
    .line 27
    const/16 v2, 0x100

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p3, p2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    move v1, v2

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v1, 0x80

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v1

    .line 42
    :cond_3
    and-int/lit16 v1, v0, 0x93

    .line 43
    .line 44
    const/16 v3, 0x92

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eq v1, v3, :cond_4

    .line 49
    .line 50
    move v1, v5

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move v1, v4

    .line 53
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 54
    .line 55
    invoke-virtual {p3, v3, v1}, Llp2;->N(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_9

    .line 60
    .line 61
    sget-object p1, Lu70;->b:Lzy0;

    .line 62
    .line 63
    and-int/lit16 v1, v0, 0x380

    .line 64
    .line 65
    if-ne v1, v2, :cond_5

    .line 66
    .line 67
    move v1, v5

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move v1, v4

    .line 70
    :goto_4
    and-int/lit8 v2, v0, 0x70

    .line 71
    .line 72
    const/16 v3, 0x20

    .line 73
    .line 74
    if-ne v2, v3, :cond_6

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move v5, v4

    .line 78
    :goto_5
    or-int/2addr v1, v5

    .line 79
    invoke-virtual {p3}, Llp2;->K()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-nez v1, :cond_7

    .line 84
    .line 85
    sget-object v1, Lzz0;->a:Lbe;

    .line 86
    .line 87
    if-ne v2, v1, :cond_8

    .line 88
    .line 89
    :cond_7
    new-instance v2, Lh8;

    .line 90
    .line 91
    const/4 v1, 0x7

    .line 92
    invoke-direct {v2, p2, v1}, Lh8;-><init>(Lzy0;B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_8
    check-cast v2, Lrn2;

    .line 99
    .line 100
    and-int/lit8 v0, v0, 0xe

    .line 101
    .line 102
    invoke-static {p0, v2, p3, v0, v4}, Lsp7;->a(Lkx4;Lrn2;Llp2;II)V

    .line 103
    .line 104
    .line 105
    :goto_6
    move-object v7, p1

    .line 106
    goto :goto_7

    .line 107
    :cond_9
    invoke-virtual {p3}, Llp2;->Q()V

    .line 108
    .line 109
    .line 110
    goto :goto_6

    .line 111
    :goto_7
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_a

    .line 116
    .line 117
    new-instance v5, Lg8;

    .line 118
    .line 119
    const/16 v10, 0x8

    .line 120
    .line 121
    move-object v6, p0

    .line 122
    move-object v8, p2

    .line 123
    move v9, p4

    .line 124
    invoke-direct/range {v5 .. v10}, Lg8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 125
    .line 126
    .line 127
    iput-object v5, p1, Lj86;->d:Lrn2;

    .line 128
    .line 129
    :cond_a
    return-void
.end method

.method public static final b(Lzy0;Llp2;I)V
    .locals 10

    .line 1
    const v0, -0x2a4a252b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    and-int/lit8 v3, p2, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v3, v0}, Llp2;->N(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    sget-object v0, Lmv6;->a:Lox1;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lkv6;

    .line 31
    .line 32
    const v4, 0x753e26b5

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v4}, Llp2;->W(I)V

    .line 36
    .line 37
    .line 38
    new-array v4, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    sget-object v6, Lzz0;->a:Lbe;

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    new-instance v5, Lw76;

    .line 49
    .line 50
    const/16 v7, 0x14

    .line 51
    .line 52
    invoke-direct {v5, v7}, Lw76;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v5, Ldn2;

    .line 59
    .line 60
    const/16 v7, 0x180

    .line 61
    .line 62
    sget-object v8, Ljv6;->g0:Lxd6;

    .line 63
    .line 64
    invoke-static {v4, v8, v5, p1, v7}, Ljm4;->Y([Ljava/lang/Object;Lbw6;Ldn2;Llp2;I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljv6;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lkv6;

    .line 75
    .line 76
    iput-object v5, v4, Ljv6;->Z:Lkv6;

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Llp2;->p(Z)V

    .line 79
    .line 80
    .line 81
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    new-instance v7, Lnw2;

    .line 86
    .line 87
    invoke-direct {v7, v1}, Lnw2;-><init>(B)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Lzw2;

    .line 91
    .line 92
    const/16 v8, 0xa

    .line 93
    .line 94
    invoke-direct {v1, v3, v4, v8}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    new-instance v8, Lxd6;

    .line 98
    .line 99
    const/4 v9, 0x6

    .line 100
    invoke-direct {v8, v7, v1, v9}, Lxd6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v3}, Llp2;->h(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p1, v4}, Llp2;->h(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    or-int/2addr v1, v7

    .line 112
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    if-nez v1, :cond_2

    .line 117
    .line 118
    if-ne v7, v6, :cond_3

    .line 119
    .line 120
    :cond_2
    new-instance v7, La23;

    .line 121
    .line 122
    const/4 v1, 0x3

    .line 123
    invoke-direct {v7, v3, v4, v1}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v7}, Llp2;->g0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    check-cast v7, Ldn2;

    .line 130
    .line 131
    invoke-static {v5, v8, v7, p1, v2}, Ljm4;->Y([Ljava/lang/Object;Lbw6;Ldn2;Llp2;I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Lo74;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v2, Li9;

    .line 142
    .line 143
    const/16 v3, 0x13

    .line 144
    .line 145
    invoke-direct {v2, p0, v1, v3}, Li9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    const v1, -0x189b31eb

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const/16 v2, 0x38

    .line 156
    .line 157
    invoke-static {v0, v1, p1, v2}, Lmb6;->a(Lt06;Lrn2;Llp2;I)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-virtual {p1}, Llp2;->Q()V

    .line 162
    .line 163
    .line 164
    :goto_1
    invoke-virtual {p1}, Llp2;->r()Lj86;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz p1, :cond_5

    .line 169
    .line 170
    new-instance v0, Lh8;

    .line 171
    .line 172
    const/16 v1, 0x8

    .line 173
    .line 174
    invoke-direct {v0, p0, p2, v1}, Lh8;-><init>(Lzy0;IB)V

    .line 175
    .line 176
    .line 177
    iput-object v0, p1, Lj86;->d:Lrn2;

    .line 178
    .line 179
    :cond_5
    return-void
.end method

.method public static final c(Lvv5;Ldn2;Ldn2;Lo87;Llp2;I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x224061ed

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4, v0}, Llp2;->X(I)Llp2;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lvv5;->e:Lh76;

    .line 17
    .line 18
    invoke-static {v0, p4}, Li21;->o(Lmh7;Llp2;)Ly05;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    invoke-virtual {p4, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p4}, Llp2;->K()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    sget-object v0, Lzz0;->a:Lbe;

    .line 33
    .line 34
    if-ne v2, v0, :cond_1

    .line 35
    .line 36
    :cond_0
    new-instance v0, Lal5;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v1, 0x1

    .line 41
    const-class v3, Lvv5;

    .line 42
    .line 43
    const-string v4, "onUiIntent"

    .line 44
    .line 45
    const-string v5, "onUiIntent(Lsu/happ/proxyutility/feature/routing/profile_copy/ProfileCopyUiIntent;)V"

    .line 46
    .line 47
    move-object v2, p0

    .line 48
    invoke-direct/range {v0 .. v7}, Lal5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, v0}, Llp2;->g0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v2, v0

    .line 55
    :cond_1
    move-object v3, v2

    .line 56
    check-cast v3, Lpv3;

    .line 57
    .line 58
    new-instance v0, Llv5;

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move-object v4, p1

    .line 62
    move-object v2, p2

    .line 63
    move-object v5, v9

    .line 64
    invoke-direct/range {v0 .. v5}, Llv5;-><init>(Lvv5;Ldn2;Lpv3;Ldn2;Ly05;)V

    .line 65
    .line 66
    .line 67
    const v1, -0x1a715838

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0, p4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const/high16 v8, 0xc00000

    .line 75
    .line 76
    const/16 v9, 0x78

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    move-object v0, p1

    .line 83
    move-object v1, p3

    .line 84
    move-object v7, p4

    .line 85
    invoke-static/range {v0 .. v9}, Lvr3;->d(Ldn2;Lo87;ZZZZLzy0;Llp2;II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p4}, Llp2;->r()Lj86;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-eqz v6, :cond_2

    .line 93
    .line 94
    new-instance v0, Lj30;

    .line 95
    .line 96
    move-object v1, p0

    .line 97
    move-object v2, p1

    .line 98
    move-object v3, p2

    .line 99
    move-object v4, p3

    .line 100
    move v5, p5

    .line 101
    invoke-direct/range {v0 .. v5}, Lj30;-><init>(Lvv5;Ldn2;Ldn2;Lo87;I)V

    .line 102
    .line 103
    .line 104
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 105
    .line 106
    :cond_2
    return-void
.end method

.method public static d(Landroid/widget/EdgeEffect;FFLfi1;)F
    .locals 8

    .line 1
    sget v0, Lcy1;->a:F

    .line 2
    .line 3
    const v0, 0x43c10b3d

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, Lfi1;->getDensity()F

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    mul-float/2addr p3, v0

    .line 11
    const/high16 v0, 0x43200000    # 160.0f

    .line 12
    .line 13
    mul-float/2addr p3, v0

    .line 14
    const v0, 0x3f570a3d    # 0.84f

    .line 15
    .line 16
    .line 17
    mul-float/2addr p3, v0

    .line 18
    float-to-double v0, p3

    .line 19
    const p3, 0x3eb33333    # 0.35f

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    mul-float/2addr v2, p3

    .line 27
    float-to-double v2, v2

    .line 28
    sget p3, Lcy1;->a:F

    .line 29
    .line 30
    float-to-double v4, p3

    .line 31
    mul-double/2addr v4, v0

    .line 32
    div-double/2addr v2, v4

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sget-wide v2, Lcy1;->b:D

    .line 38
    .line 39
    sget-wide v6, Lcy1;->c:D

    .line 40
    .line 41
    div-double/2addr v2, v6

    .line 42
    mul-double/2addr v2, v0

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    mul-double/2addr v0, v4

    .line 48
    double-to-float p3, v0

    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/16 v2, 0x1f

    .line 53
    .line 54
    if-lt v0, v2, :cond_0

    .line 55
    .line 56
    invoke-static {p0}, Ltc;->k(Landroid/widget/EdgeEffect;)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v3, v1

    .line 62
    :goto_0
    mul-float/2addr v3, p2

    .line 63
    cmpg-float p2, p3, v3

    .line 64
    .line 65
    if-gtz p2, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, Lnr4;->O(F)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-lt v0, v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return p1

    .line 87
    :cond_3
    return v1
.end method

.method public static e([F)F
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v1, p0, v1

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    aget v3, p0, v3

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    aget v4, p0, v4

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    aget v5, p0, v5

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    aget p0, p0, v6

    .line 24
    .line 25
    mul-float v6, v0, v4

    .line 26
    .line 27
    mul-float v7, v1, v5

    .line 28
    .line 29
    add-float/2addr v7, v6

    .line 30
    mul-float v6, v3, p0

    .line 31
    .line 32
    add-float/2addr v6, v7

    .line 33
    mul-float/2addr v4, v5

    .line 34
    sub-float/2addr v6, v4

    .line 35
    mul-float/2addr v1, v3

    .line 36
    sub-float/2addr v6, v1

    .line 37
    mul-float/2addr v0, p0

    .line 38
    sub-float/2addr v6, v0

    .line 39
    const/high16 p0, 0x3f000000    # 0.5f

    .line 40
    .line 41
    mul-float/2addr v6, p0

    .line 42
    cmpg-float p0, v6, v2

    .line 43
    .line 44
    if-gez p0, :cond_1

    .line 45
    .line 46
    neg-float p0, v6

    .line 47
    return p0

    .line 48
    :cond_1
    return v6
.end method

.method public static f(III)I
    .locals 1

    .line 1
    ushr-int v0, p0, p2

    .line 2
    .line 3
    xor-int/2addr v0, p0

    .line 4
    and-int/2addr p1, v0

    .line 5
    shl-int p2, p1, p2

    .line 6
    .line 7
    xor-int/2addr p1, p2

    .line 8
    xor-int/2addr p0, p1

    .line 9
    return p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 1
    const-string v0, "permission must be non-null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg33;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x21

    .line 9
    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 13
    .line 14
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance p1, Ly65;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ly65;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p1, Ly65;->b:Landroid/app/NotificationManager;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, -0x1

    .line 36
    return p0

    .line 37
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public static final j(II)V
    .locals 3

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    if-lez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, " must be greater than zero."

    .line 7
    .line 8
    if-eq p0, p1, :cond_1

    .line 9
    .line 10
    const-string v1, "Both size "

    .line 11
    .line 12
    const-string v2, " and step "

    .line 13
    .line 14
    invoke-static {p0, v1, p1, v2, v0}, Lpc6;->k(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string p1, "size "

    .line 20
    .line 21
    invoke-static {p1, p0, v0}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final k(Lyk3;Z)Lne0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcl3;->U()Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-static {p0}, Lmb6;->K(Lkb6;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Lbe0;

    .line 30
    .line 31
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lmb6;->C(Lkb6;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {p1, v0, p0}, Lbe0;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    new-instance p0, Lde0;

    .line 44
    .line 45
    invoke-direct {p0, v0, v1, v2}, Lde0;-><init>(Ljava/lang/reflect/Field;ZB)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    invoke-static {p0}, Lmb6;->K(Lkb6;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    new-instance p1, Lfe0;

    .line 56
    .line 57
    invoke-virtual {p0}, Lyk3;->T()Lcl3;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lmb6;->C(Lkb6;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {p1, v0, v2, p0}, Lfe0;-><init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_2
    new-instance p0, Lhe0;

    .line 70
    .line 71
    invoke-direct {p0, v0, v2, v1, v2}, Lhe0;-><init>(Ljava/lang/reflect/Field;ZZB)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    const/4 p0, 0x2

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    new-instance p1, Lde0;

    .line 79
    .line 80
    invoke-direct {p1, v0, v2, p0}, Lde0;-><init>(Ljava/lang/reflect/Field;ZB)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    new-instance p1, Lhe0;

    .line 85
    .line 86
    invoke-direct {p1, v0, v2, v2, p0}, Lhe0;-><init>(Ljava/lang/reflect/Field;ZZB)V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

.method public static final l(IILta7;Lpw6;Lta7;)J
    .locals 2

    .line 1
    sget-object v0, Lta7;->c:Lta7;

    .line 2
    .line 3
    invoke-static {p2, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p2, Lta7;->a:Lyo1;

    .line 11
    .line 12
    invoke-static {p0, p3}, Lw79;->N(Lyo1;Lpw6;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    iget-object p1, p2, Lta7;->b:Lyo1;

    .line 17
    .line 18
    invoke-static {p1, p3}, Lw79;->N(Lyo1;Lpw6;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    iget-object p2, p4, Lta7;->a:Lyo1;

    .line 23
    .line 24
    iget-object p3, p4, Lta7;->b:Lyo1;

    .line 25
    .line 26
    instance-of p4, p2, Lwo1;

    .line 27
    .line 28
    const v0, 0x7fffffff

    .line 29
    .line 30
    .line 31
    const/high16 v1, -0x80000000

    .line 32
    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    if-eq p0, v1, :cond_2

    .line 36
    .line 37
    if-ne p0, v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    check-cast p2, Lwo1;

    .line 41
    .line 42
    iget p2, p2, Lwo1;->a:I

    .line 43
    .line 44
    if-le p0, p2, :cond_2

    .line 45
    .line 46
    move p0, p2

    .line 47
    :cond_2
    :goto_1
    instance-of p2, p3, Lwo1;

    .line 48
    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    if-eq p1, v1, :cond_4

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    check-cast p3, Lwo1;

    .line 57
    .line 58
    iget p2, p3, Lwo1;->a:I

    .line 59
    .line 60
    if-le p1, p2, :cond_4

    .line 61
    .line 62
    move p1, p2

    .line 63
    :cond_4
    :goto_2
    int-to-long p2, p0

    .line 64
    const/16 p0, 0x20

    .line 65
    .line 66
    shl-long/2addr p2, p0

    .line 67
    int-to-long p0, p1

    .line 68
    const-wide v0, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr p0, v0

    .line 74
    or-long/2addr p0, p2

    .line 75
    return-wide p0
.end method

.method public static final m(Lcl3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcl3;->U()Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string v0, "Only static properties are supported for now: "

    .line 17
    .line 18
    invoke-virtual {p0}, Lcl3;->U()Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0, v0}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static final n(IIIILpw6;Lta7;)D
    .locals 5

    .line 1
    int-to-double v0, p2

    .line 2
    int-to-double v2, p0

    .line 3
    div-double/2addr v0, v2

    .line 4
    int-to-double p2, p3

    .line 5
    int-to-double p0, p1

    .line 6
    div-double/2addr p2, p0

    .line 7
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p4, v4, :cond_0

    .line 15
    .line 16
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 22
    .line 23
    .line 24
    const-wide/16 p0, 0x0

    .line 25
    .line 26
    return-wide p0

    .line 27
    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide p2

    .line 31
    :goto_0
    iget-object p4, p5, Lta7;->a:Lyo1;

    .line 32
    .line 33
    instance-of v0, p4, Lwo1;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    check-cast p4, Lwo1;

    .line 38
    .line 39
    iget p4, p4, Lwo1;->a:I

    .line 40
    .line 41
    int-to-double v0, p4

    .line 42
    div-double/2addr v0, v2

    .line 43
    cmpl-double p4, p2, v0

    .line 44
    .line 45
    if-lez p4, :cond_2

    .line 46
    .line 47
    move-wide p2, v0

    .line 48
    :cond_2
    iget-object p4, p5, Lta7;->b:Lyo1;

    .line 49
    .line 50
    instance-of p5, p4, Lwo1;

    .line 51
    .line 52
    if-eqz p5, :cond_3

    .line 53
    .line 54
    check-cast p4, Lwo1;

    .line 55
    .line 56
    iget p4, p4, Lwo1;->a:I

    .line 57
    .line 58
    int-to-double p4, p4

    .line 59
    div-double/2addr p4, p0

    .line 60
    cmpl-double p0, p2, p4

    .line 61
    .line 62
    if-lez p0, :cond_3

    .line 63
    .line 64
    return-wide p4

    .line 65
    :cond_3
    return-wide p2
.end method

.method public static final o(Lt14;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, Ltg7;->q:Lfk2;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Lsm;->p(Lfk2;)Lgm;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-interface {p0}, Lgm;->e()Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lug7;->e:Lv15;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lzp4;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ls21;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast p0, Lrf3;

    .line 34
    .line 35
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0
.end method

.method public static final p(Lzz3;Lsm;Lt14;Ljava/util/List;Ljava/util/ArrayList;Lt14;Z)Laa7;
    .locals 9

    .line 1
    sget-object v0, Loy1;->f0:Lrm;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    add-int/2addr v3, v2

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    move v5, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v5, v2

    .line 24
    :goto_0
    add-int/2addr v3, v5

    .line 25
    add-int/2addr v3, v4

    .line 26
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v5, 0xa

    .line 32
    .line 33
    invoke-static {p3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lt14;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v7, Lwg7;

    .line 60
    .line 61
    invoke-direct {v7, v6}, Lwg7;-><init>(Lt14;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    new-instance v5, Lwg7;

    .line 75
    .line 76
    invoke-direct {v5, p2}, Lwg7;-><init>(Lt14;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move-object v5, v3

    .line 81
    :goto_2
    if-eqz v5, :cond_3

    .line 82
    .line 83
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    move v6, v2

    .line 91
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_5

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    add-int/lit8 v8, v6, 0x1

    .line 102
    .line 103
    if-ltz v6, :cond_4

    .line 104
    .line 105
    check-cast v7, Lt14;

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v6, Lwg7;

    .line 111
    .line 112
    invoke-direct {v6, v7}, Lwg7;-><init>(Lt14;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move v6, v8

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    invoke-static {}, Li21;->X()V

    .line 121
    .line 122
    .line 123
    throw v3

    .line 124
    :cond_5
    new-instance v3, Lwg7;

    .line 125
    .line 126
    invoke-direct {v3, p5}, Lwg7;-><init>(Lt14;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 137
    .line 138
    .line 139
    move-result p5

    .line 140
    add-int/2addr p5, p4

    .line 141
    if-nez p2, :cond_6

    .line 142
    .line 143
    move v4, v2

    .line 144
    :cond_6
    add-int/2addr p5, v4

    .line 145
    if-eqz p6, :cond_7

    .line 146
    .line 147
    invoke-virtual {p0, p5}, Lzz3;->w(I)Lsx4;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    goto :goto_4

    .line 152
    :cond_7
    sget-object p4, Lug7;->a:Lv15;

    .line 153
    .line 154
    new-instance p4, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string p6, "Function"

    .line 157
    .line 158
    invoke-direct {p4, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    invoke-virtual {p0, p4}, Lzz3;->k(Ljava/lang/String;)Lsx4;

    .line 169
    .line 170
    .line 171
    move-result-object p4

    .line 172
    :goto_4
    if-eqz p2, :cond_a

    .line 173
    .line 174
    sget-object p2, Ltg7;->p:Lfk2;

    .line 175
    .line 176
    invoke-interface {p1, p2}, Lsm;->k(Lfk2;)Z

    .line 177
    .line 178
    .line 179
    move-result p5

    .line 180
    if-eqz p5, :cond_8

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    new-instance p5, Lga0;

    .line 184
    .line 185
    sget-object p6, Le02;->X:Le02;

    .line 186
    .line 187
    invoke-direct {p5, p0, p2, p6}, Lga0;-><init>(Lzz3;Lfk2;Ljava/util/Map;)V

    .line 188
    .line 189
    .line 190
    invoke-static {p1, p5}, Lwv0;->G0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-eqz p2, :cond_9

    .line 199
    .line 200
    move-object p1, v0

    .line 201
    goto :goto_5

    .line 202
    :cond_9
    new-instance p2, Lvm;

    .line 203
    .line 204
    invoke-direct {p2, p1, v2}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    move-object p1, p2

    .line 208
    :cond_a
    :goto_5
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    if-nez p2, :cond_d

    .line 213
    .line 214
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    sget-object p3, Ltg7;->q:Lfk2;

    .line 219
    .line 220
    invoke-interface {p1, p3}, Lsm;->k(Lfk2;)Z

    .line 221
    .line 222
    .line 223
    move-result p5

    .line 224
    if-eqz p5, :cond_b

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_b
    new-instance p5, Lga0;

    .line 228
    .line 229
    sget-object p6, Lug7;->e:Lv15;

    .line 230
    .line 231
    new-instance v3, Lrf3;

    .line 232
    .line 233
    invoke-direct {v3, p2}, Lrf3;-><init>(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {p6, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-direct {p5, p0, p3, p2}, Lga0;-><init>(Lzz3;Lfk2;Ljava/util/Map;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1, p5}, Lwv0;->G0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_c

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_c
    new-instance v0, Lvm;

    .line 258
    .line 259
    invoke-direct {v0, p0, v2}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 260
    .line 261
    .line 262
    :goto_6
    move-object p1, v0

    .line 263
    :cond_d
    :goto_7
    invoke-static {p1}, Lbt7;->j(Lsm;)Lch8;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {p0, p4, v1}, Ldh3;->M(Lch8;Lsx4;Ljava/util/List;)Laa7;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    return-object p0
.end method

.method public static final q(Lsx4;Lsx4;)Lxg7;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lsx4;->k0()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lsx4;->k0()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lsx4;->k0()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 v1, 0xa

    .line 31
    .line 32
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lhi8;

    .line 54
    .line 55
    invoke-interface {v2}, Lhi8;->l()Llh8;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1}, Lsx4;->k0()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance p1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lhi8;

    .line 94
    .line 95
    invoke-interface {v1}, Lot0;->X()Laa7;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v2, Lwg7;

    .line 103
    .line 104
    invoke-direct {v2, v1}, Lwg7;-><init>(Lt14;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-static {v0, p1}, Lwv0;->e1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Lzp4;->P(Ljava/util/List;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance p1, Lxg7;

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    invoke-direct {p1, p0, v0}, Lxg7;-><init>(Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    return-object p1
.end method

.method public static final r(Lkx4;Lgn2;)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Lnv1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnv1;-><init>(Lgn2;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final s(Lkx4;Lgn2;)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Lvv1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lvv1;-><init>(Lgn2;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final t(Lkx4;Lgn2;)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Lwv1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lwv1;-><init>(Lgn2;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final u(Lt14;)Lv15;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt14;->getAnnotations()Lsm;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ltg7;->r:Lfk2;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lsm;->p(Lfk2;)Lgm;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-interface {p0}, Lgm;->e()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-static {p0}, Lwv0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of v1, p0, Lbm7;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    check-cast p0, Lbm7;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v0

    .line 37
    :goto_0
    if-eqz p0, :cond_3

    .line 38
    .line 39
    iget-object p0, p0, Ls21;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    invoke-static {p0}, Lv15;->f(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object p0, v0

    .line 53
    :goto_1
    if-eqz p0, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static v(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Lvf6;

    .line 10
    .line 11
    invoke-direct {v1, v0, p0}, Lvf6;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lxf6;->c:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget-object v3, Lxf6;->b:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroid/util/SparseArray;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-lez v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Luf6;

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    iget-object v6, v5, Luf6;->b:Landroid/content/res/Configuration;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v6, v7}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    iget v6, v5, Luf6;->c:I

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_0
    :goto_0
    if-eqz p0, :cond_2

    .line 65
    .line 66
    iget v6, v5, Luf6;->c:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/content/res/Resources$Theme;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-ne v6, v7, :cond_2

    .line 73
    .line 74
    :cond_1
    iget-object v3, v5, Luf6;->a:Landroid/content/res/ColorStateList;

    .line 75
    .line 76
    monitor-exit v2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 79
    .line 80
    .line 81
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    move-object v3, v4

    .line 83
    :goto_1
    if-eqz v3, :cond_4

    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_4
    sget-object v2, Lxf6;->a:Ljava/lang/ThreadLocal;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Landroid/util/TypedValue;

    .line 93
    .line 94
    if-nez v3, :cond_5

    .line 95
    .line 96
    new-instance v3, Landroid/util/TypedValue;

    .line 97
    .line 98
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    const/4 v2, 0x1

    .line 105
    invoke-virtual {v0, p1, v3, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 106
    .line 107
    .line 108
    iget v2, v3, Landroid/util/TypedValue;->type:I

    .line 109
    .line 110
    const/16 v3, 0x1c

    .line 111
    .line 112
    if-lt v2, v3, :cond_6

    .line 113
    .line 114
    const/16 v3, 0x1f

    .line 115
    .line 116
    if-gt v2, v3, :cond_6

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :try_start_1
    invoke-static {v0, v2, p0}, Low0;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    .line 126
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 127
    :catch_0
    :goto_2
    if-eqz v4, :cond_8

    .line 128
    .line 129
    sget-object v2, Lxf6;->c:Ljava/lang/Object;

    .line 130
    .line 131
    monitor-enter v2

    .line 132
    :try_start_2
    sget-object v0, Lxf6;->b:Ljava/util/WeakHashMap;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Landroid/util/SparseArray;

    .line 139
    .line 140
    if-nez v3, :cond_7

    .line 141
    .line 142
    new-instance v3, Landroid/util/SparseArray;

    .line 143
    .line 144
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_1
    move-exception p0

    .line 152
    goto :goto_4

    .line 153
    :cond_7
    :goto_3
    new-instance v0, Luf6;

    .line 154
    .line 155
    iget-object v1, v1, Lvf6;->a:Landroid/content/res/Resources;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-direct {v0, v4, v1, p0}, Luf6;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, p1, v0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    monitor-exit v2

    .line 168
    goto :goto_5

    .line 169
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    throw p0

    .line 171
    :cond_8
    invoke-virtual {v0, p1, p0}, Landroid/content/res/Resources;->getColorStateList(ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    :goto_5
    return-object v4

    .line 176
    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 177
    throw p0
.end method

.method public static final w(Lt14;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lw79;->F(Lt14;)Z

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lw79;->o(Lt14;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Ld02;->X:Ld02;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p0, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lni8;

    .line 51
    .line 52
    invoke-virtual {v1}, Lni8;->b()Lt14;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-object v0
.end method

.method public static final x(Lgk2;)Lso2;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgk2;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lgk2;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Luo2;->b:Luo2;

    .line 15
    .line 16
    invoke-virtual {p0}, Lgk2;->i()Lfk2;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lfk2;->b()Lfk2;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, Lgk2;->g()Lv15;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Luo2;->a(Lfk2;Ljava/lang/String;)Lto2;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    iget-object p0, p0, Lto2;->a:Lso2;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public static y(Landroid/content/Context;)Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Len;->r(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lr52;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p0, v0, v1}, Lr52;-><init>(Landroid/os/Handler;B)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static final z(Landroid/view/KeyEvent;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isAltPressed()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isMetaPressed()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    or-int/2addr v0, v1

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v3

    .line 29
    :goto_1
    or-int/2addr v0, v1

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    const/16 v3, 0x8

    .line 33
    .line 34
    :cond_2
    or-int p0, v0, v3

    .line 35
    .line 36
    return p0
.end method


# virtual methods
.method public L(Lx14;)Lx14;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-object p1
.end method

.method public g(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Lps2;Lqs2;)Lis2;
    .locals 0

    .line 1
    check-cast p5, Li89;

    .line 2
    .line 3
    check-cast p6, Li89;

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, Lw79;->h(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Li89;Li89;)Lis2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public h(Landroid/content/Context;Landroid/os/Looper;Lfu6;Ljava/lang/Object;Li89;Li89;)Lis2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "buildClient must be implemented"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
