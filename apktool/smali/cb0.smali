.class public final Lcb0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrs;
.implements Llu8;


# instance fields
.field public final synthetic X:B

.field public Y:I

.field public Z:I

.field public f0:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lcb0;->X:B

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 57
    new-array v0, v0, [Lcb0;

    iput-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 58
    iput v0, p0, Lcb0;->Y:I

    .line 59
    iput v0, p0, Lcb0;->Z:I

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 52
    iput-byte p1, p0, Lcb0;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIB)V
    .locals 1

    .line 1
    iput-byte p3, p0, Lcb0;->X:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x2

    .line 10
    new-array p3, p3, [I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    aput p1, p3, v0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    aput p2, p3, v0

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, [[B

    .line 25
    .line 26
    iput-object p3, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 27
    .line 28
    iput p1, p0, Lcb0;->Y:I

    .line 29
    .line 30
    iput p2, p0, Lcb0;->Z:I

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 p3, 0x0

    .line 37
    iput-object p3, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 38
    .line 39
    iput p1, p0, Lcb0;->Y:I

    .line 40
    .line 41
    and-int/lit8 p1, p2, 0x7

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    const/16 p1, 0x8

    .line 46
    .line 47
    :cond_0
    iput p1, p0, Lcb0;->Z:I

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(IILdn2;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, Lcb0;->X:B

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p1, p0, Lcb0;->Y:I

    iput p2, p0, Lcb0;->Z:I

    iput-object p3, p0, Lcb0;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IILxx1;)V
    .locals 2

    const/4 v0, 0x6

    iput-byte v0, p0, Lcb0;->X:B

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput p1, p0, Lcb0;->Y:I

    .line 65
    iput p2, p0, Lcb0;->Z:I

    .line 66
    new-instance v0, Lyr6;

    new-instance v1, Lue2;

    invoke-direct {v1, p1, p2, p3}, Lue2;-><init>(IILxx1;)V

    invoke-direct {v0, v1}, Lyr6;-><init>(Lne2;)V

    iput-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, Lcb0;->X:B

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcb0;->Z:I

    iput-object p1, p0, Lcb0;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;II)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, Lcb0;->X:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb0;->f0:Ljava/lang/Object;

    iput p2, p0, Lcb0;->Y:I

    iput p3, p0, Lcb0;->Z:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, Lcb0;->X:B

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcb0;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrs;I)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Lcb0;->X:B

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcb0;->f0:Ljava/lang/Object;

    iput p2, p0, Lcb0;->Y:I

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    iget v1, p0, Lcb0;->Y:I

    .line 6
    .line 7
    aput p1, v0, v1

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iget p1, p0, Lcb0;->Z:I

    .line 12
    .line 13
    and-int/2addr p1, v1

    .line 14
    iput p1, p0, Lcb0;->Y:I

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    array-length p1, v0

    .line 19
    shl-int/lit8 v1, p1, 0x1

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-array v2, v1, [I

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v3, v3, p1, v0, v2}, Leu;->e0(III[I[I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, [I

    .line 32
    .line 33
    invoke-static {p1, v3, v3, v0, v2}, Leu;->e0(III[I[I)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 37
    .line 38
    iput p1, p0, Lcb0;->Y:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, -0x1

    .line 41
    .line 42
    iput v1, p0, Lcb0;->Z:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const-string p0, "Max array capacity exceeded"

    .line 46
    .line 47
    invoke-static {p0}, Lkp5;->t(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget v0, p0, Lcb0;->Y:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    iget v0, p0, Lcb0;->Z:I

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lej4;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v1, Lej4;->c:Lk42;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget v1, v1, Lej4;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    iget v0, p0, Lcb0;->Z:I

    .line 23
    .line 24
    if-eq v1, v0, :cond_5

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit v0

    .line 29
    throw p0

    .line 30
    :cond_0
    :goto_0
    new-instance v1, Lej4;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lej4;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {}, Lkp5;->e()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    const/4 v1, 0x3

    .line 43
    if-eq v0, v1, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    if-ne v0, v1, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_4
    :goto_1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lej4;

    .line 56
    .line 57
    const v1, 0x7fffffff

    .line 58
    .line 59
    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    iget-object v2, v0, Lej4;->c:Lk42;

    .line 63
    .line 64
    monitor-enter v2

    .line 65
    :try_start_1
    iget v0, v0, Lej4;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    if-eq v0, v1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    return-void

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    monitor-exit v2

    .line 74
    throw p0

    .line 75
    :cond_6
    :goto_2
    new-instance v0, Lej4;

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lej4;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 81
    .line 82
    return-void
.end method

.method public e(II)B
    .locals 0

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [[B

    .line 4
    .line 5
    aget-object p0, p0, p2

    .line 6
    .line 7
    aget-byte p0, p0, p1

    .line 8
    .line 9
    return p0
.end method

.method public f()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrs;

    .line 4
    .line 5
    invoke-interface {p0}, Lrs;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public g(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrs;

    .line 4
    .line 5
    iget v1, p0, Lcb0;->Z:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lcb0;->Y:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrs;->g(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lcb0;->Z:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcb0;->Z:I

    .line 6
    .line 7
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lrs;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lrs;->h(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public i()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrs;

    .line 4
    .line 5
    invoke-interface {p0}, Lrs;->i()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(III)V
    .locals 1

    .line 1
    iget v0, p0, Lcb0;->Z:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcb0;->Y:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lrs;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {p0, p1, p2, p3}, Lrs;->j(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public k(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrs;

    .line 4
    .line 5
    iget v1, p0, Lcb0;->Z:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lcb0;->Y:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrs;->k(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    iget v0, p0, Lcb0;->Z:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Ld01;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Lcb0;->Z:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Lcb0;->Z:I

    .line 16
    .line 17
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lrs;

    .line 20
    .line 21
    invoke-interface {p0}, Lrs;->l()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public m(JLwk;Lwk;Lwk;)Lwk;
    .locals 6

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lyr6;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lyr6;->m(JLwk;Lwk;Lwk;)Lwk;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public n(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrs;

    .line 4
    .line 5
    iget v1, p0, Lcb0;->Z:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lcb0;->Y:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrs;->n(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p(Lrn2;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrs;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lrs;->p(Lrn2;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(I)I
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcb0;->Y:I

    .line 4
    .line 5
    iget v1, p0, Lcb0;->Z:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ge p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, [I

    .line 13
    .line 14
    and-int/2addr p1, v1

    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public r()Z
    .locals 1

    .line 1
    iget v0, p0, Lcb0;->Y:I

    .line 2
    .line 3
    iget p0, p0, Lcb0;->Z:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public s()Lal8;
    .locals 3

    .line 1
    iget v0, p0, Lcb0;->Y:I

    .line 2
    .line 3
    iget v1, p0, Lcb0;->Z:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lal8;

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iput v2, p0, Lcb0;->Y:I

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lal8;->b(I)Lal8;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {}, Lbt;->n()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public t(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [[B

    .line 4
    .line 5
    aget-object p0, p0, p2

    .line 6
    .line 7
    int-to-byte p2, p3

    .line 8
    aput-byte p2, p0, p1

    .line 9
    .line 10
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-byte v0, p0, Lcb0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    iget v1, p0, Lcb0;->Y:I

    .line 14
    .line 15
    mul-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    iget v3, p0, Lcb0;->Z:I

    .line 18
    .line 19
    mul-int/2addr v2, v3

    .line 20
    add-int/lit8 v2, v2, 0x2

    .line 21
    .line 22
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    move v4, v2

    .line 27
    :goto_0
    if-ge v4, v3, :cond_3

    .line 28
    .line 29
    iget-object v5, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, [[B

    .line 32
    .line 33
    aget-object v5, v5, v4

    .line 34
    .line 35
    move v6, v2

    .line 36
    :goto_1
    if-ge v6, v1, :cond_2

    .line 37
    .line 38
    aget-byte v7, v5, v6

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    const/4 v8, 0x1

    .line 43
    if-eq v7, v8, :cond_0

    .line 44
    .line 45
    const-string v7, "  "

    .line 46
    .line 47
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_0
    const-string v7, " 1"

    .line 52
    .line 53
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    const-string v7, " 0"

    .line 58
    .line 59
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/16 v5, 0xa

    .line 66
    .line 67
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized u()I
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcb0;->Z:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return v0

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0}, Ln59;->a(Landroid/content/Context;)Lbz1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "com.google.android.c2dm.permission.SEND"

    .line 21
    .line 22
    const-string v3, "com.google.android.gms"

    .line 23
    .line 24
    iget-object v0, v0, Lbz1;->a:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    const/4 v2, -0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    if-ne v0, v2, :cond_1

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return v3

    .line 40
    :cond_1
    :try_start_2
    invoke-static {}, Lzc1;->T()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v2, 0x1

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Landroid/content/Intent;

    .line 48
    .line 49
    const-string v4, "com.google.android.c2dm.intent.REGISTER"

    .line 50
    .line 51
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v4, "com.google.android.gms"

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    new-instance v0, Landroid/content/Intent;

    .line 75
    .line 76
    const-string v4, "com.google.iid.TOKEN_REQUEST"

    .line 77
    .line 78
    invoke-direct {v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v4, "com.google.android.gms"

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v1, 0x2

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_3

    .line 98
    .line 99
    move v2, v1

    .line 100
    :goto_0
    iput v2, p0, Lcb0;->Z:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return v2

    .line 104
    :cond_3
    :try_start_3
    invoke-static {}, Lzc1;->T()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eq v2, v0, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    move v2, v1

    .line 112
    :goto_1
    iput v2, p0, Lcb0;->Z:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    .line 114
    monitor-exit p0

    .line 115
    return v2

    .line 116
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 117
    throw v0
.end method

.method public v()I
    .locals 0

    .line 1
    iget p0, p0, Lcb0;->Z:I

    .line 2
    .line 3
    return p0
.end method

.method public declared-synchronized w()I
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcb0;->Y:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "com.google.android.gms"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    :try_start_1
    iget-object v1, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v1}, Ln59;->a(Landroid/content/Context;)Lbz1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, Lbz1;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    :try_start_2
    const-string v1, "Failed to find package "

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    :goto_0
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 44
    .line 45
    iput v0, p0, Lcb0;->Y:I

    .line 46
    .line 47
    :cond_0
    iget v0, p0, Lcb0;->Y:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return v0

    .line 51
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    throw v0
.end method

.method public x()I
    .locals 0

    .line 1
    iget p0, p0, Lcb0;->Y:I

    .line 2
    .line 3
    return p0
.end method

.method public z(JLwk;Lwk;Lwk;)Lwk;
    .locals 6

    .line 1
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lyr6;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lyr6;->z(JLwk;Lwk;Lwk;)Lwk;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
