.class public final Leb9;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh91;
.implements Lm73;


# static fields
.field public static h0:Leb9;

.field public static i0:Landroid/os/HandlerThread;

.field public static j0:Landroid/os/Handler;


# instance fields
.field public final synthetic X:B

.field public Y:I

.field public Z:Ljava/lang/Object;

.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Leb9;->X:B

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    .line 45
    new-array v0, v0, [Landroid/util/SparseIntArray;

    iput-object v0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 47
    new-instance v0, Llm2;

    invoke-direct {v0, p0}, Llm2;-><init>(Leb9;)V

    iput-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 48
    iput p1, p0, Leb9;->Y:I

    return-void
.end method

.method public constructor <init>(ILl90;Ls61;Lxe2;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, Leb9;->X:B

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p4, p0, Leb9;->Z:Ljava/lang/Object;

    .line 39
    iput p1, p0, Leb9;->Y:I

    .line 40
    iput-object p2, p0, Leb9;->f0:Ljava/lang/Object;

    .line 41
    iput-object p3, p0, Leb9;->g0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Leb9;->X:B

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxa9;

    invoke-direct {v0, p0}, Lxa9;-><init>(Leb9;)V

    iput-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Leb9;->Y:I

    iput-object p2, p0, Leb9;->f0:Ljava/lang/Object;

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Leb9;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkd8;)V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, Leb9;->X:B

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Leb9;->Z:Ljava/lang/Object;

    .line 35
    new-instance p1, Lc15;

    const/16 v0, 0x10

    new-array v0, v0, [Lgn2;

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 36
    iput-object p1, p0, Leb9;->g0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmn3;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, Leb9;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Leb9;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    const/16 p1, 0x8

    .line 10
    .line 11
    new-array v0, p1, [Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    new-array v0, p1, [I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/4 v2, -0x1

    .line 19
    if-ge v1, p1, :cond_0

    .line 20
    .line 21
    aput v2, v0, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 27
    .line 28
    iput v2, p0, Leb9;->Y:I

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Lsu/happ/proxyutility/ui/BaseActivity;Lgb4;ILandroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Leb9;->X:B

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Leb9;->Z:Ljava/lang/Object;

    iput-object p2, p0, Leb9;->f0:Ljava/lang/Object;

    iput p3, p0, Leb9;->Y:I

    iput-object p4, p0, Leb9;->g0:Ljava/lang/Object;

    return-void
.end method

.method public static j(Landroid/util/SparseIntArray;J)V
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-wide/32 v0, 0x7a120

    .line 4
    .line 5
    .line 6
    add-long/2addr v0, p1

    .line 7
    const-wide/32 v2, 0xf4240

    .line 8
    .line 9
    .line 10
    div-long/2addr v0, v2

    .line 11
    long-to-int v0, v0

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    cmp-long p1, p1, v1

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/util/SparseIntArray;->get(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseIntArray;->put(II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static declared-synchronized n(Landroid/content/Context;)Leb9;
    .locals 4

    .line 1
    const-class v0, Leb9;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Leb9;->h0:Leb9;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Leb9;

    .line 9
    .line 10
    new-instance v2, Le25;

    .line 11
    .line 12
    const-string v3, "MessengerIpcClient"

    .line 13
    .line 14
    invoke-direct {v2, v3}, Le25;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, p0, v2}, Leb9;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Leb9;->h0:Leb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg48;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, v0, Lg48;->Z:Lmi5;

    .line 8
    .line 9
    invoke-virtual {p0}, Lmi5;->length()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lkd8;

    .line 17
    .line 18
    invoke-virtual {p0}, Lkd8;->d()Lh48;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, Lh48;->Z:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public b(J)J
    .locals 1

    .line 1
    iget-object p0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkd8;

    .line 4
    .line 5
    iget-object v0, p0, Lkd8;->c:Lqe4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lkd8;->e(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0

    .line 14
    :cond_0
    return-wide p1
.end method

.method public c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget v1, p0, Leb9;->Y:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-static {v0, v1}, Lwv0;->o0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_0
    check-cast v1, Landroid/view/View;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_2
    iget-object p0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method

.method public f(J)J
    .locals 1

    .line 1
    iget-object p0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkd8;

    .line 4
    .line 5
    iget-object v0, p0, Lkd8;->c:Lqe4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lkd8;->f(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0

    .line 14
    :cond_0
    return-wide p1
.end method

.method public g()Z
    .locals 0

    .line 1
    iget-object p0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 4
    .line 5
    invoke-virtual {p0}, Lsu/happ/proxyutility/ui/BaseActivity;->x()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public i()Z
    .locals 3

    .line 1
    iget-object v0, p0, Leb9;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget v1, p0, Leb9;->Y:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0, v1}, Lwv0;->U0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ldq4;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ldq4;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ldq4;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    move-object v1, v0

    .line 28
    check-cast v1, Lqk6;

    .line 29
    .line 30
    iget-object v1, v1, Lqk6;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/ListIterator;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    move-object v2, v1

    .line 45
    check-cast v2, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v1, 0x0

    .line 55
    :goto_0
    check-cast v1, Landroid/view/View;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :cond_2
    iget-object p0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0
.end method

.method public k()Z
    .locals 11

    .line 1
    iget-object v0, p0, Leb9;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkd8;

    .line 4
    .line 5
    iget-object v1, p0, Leb9;->g0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc15;

    .line 8
    .line 9
    iget v2, p0, Leb9;->Y:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    iput v2, p0, Leb9;->Y:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    iget v2, v1, Lc15;->Z:I

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v2, v0, Lkd8;->a:Ly68;

    .line 24
    .line 25
    iget-object v5, v0, Lkd8;->b:Lde3;

    .line 26
    .line 27
    iget-object v6, v2, Ly68;->b:Lg48;

    .line 28
    .line 29
    invoke-virtual {v6}, Lg48;->a()Lmj0;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6}, Lmj0;->A()V

    .line 34
    .line 35
    .line 36
    iget-object v6, v2, Ly68;->b:Lg48;

    .line 37
    .line 38
    iget-object v7, v0, Lkd8;->c:Lqe4;

    .line 39
    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-object v6, p0, Leb9;->f0:Ljava/lang/Object;

    .line 44
    .line 45
    :goto_0
    iget-object v7, v1, Lc15;->X:[Ljava/lang/Object;

    .line 46
    .line 47
    iget v8, v1, Lc15;->Z:I

    .line 48
    .line 49
    move v9, v4

    .line 50
    :goto_1
    if-ge v9, v8, :cond_1

    .line 51
    .line 52
    aget-object v10, v7, v9

    .line 53
    .line 54
    check-cast v10, Lgn2;

    .line 55
    .line 56
    invoke-interface {v10, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v9, v9, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0, v6}, Lkd8;->l(Lg48;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Le58;->X:Le58;

    .line 66
    .line 67
    invoke-virtual {v2, v5, v4, v0}, Ly68;->b(Lde3;ZLe58;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ly68;->f(Z)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v2, Ly68;->b:Lg48;

    .line 74
    .line 75
    iget-boolean v0, v0, Lg48;->g0:Z

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ly68;->e(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lc15;->g()V

    .line 81
    .line 82
    .line 83
    :cond_2
    iget p0, p0, Leb9;->Y:I

    .line 84
    .line 85
    if-lez p0, :cond_3

    .line 86
    .line 87
    return v3

    .line 88
    :cond_3
    return v4
.end method

.method public l()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Leb9;->Y:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_4

    .line 14
    .line 15
    iget-object v3, p0, Leb9;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, [Ljava/lang/Object;

    .line 18
    .line 19
    aget-object v3, v3, v2

    .line 20
    .line 21
    instance-of v4, v3, Le37;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v3, Le37;

    .line 26
    .line 27
    invoke-interface {v3}, Le37;->r()Lnr4;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, Lpm7;->N:Lpm7;

    .line 32
    .line 33
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v5, p0, Leb9;->g0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, [I

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    aget v3, v5, v2

    .line 44
    .line 45
    const/4 v4, -0x1

    .line 46
    if-eq v3, v4, :cond_3

    .line 47
    .line 48
    const-string v3, "["

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Leb9;->g0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, [I

    .line 56
    .line 57
    aget v3, v3, v2

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, "]"

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    aget v4, v5, v2

    .line 69
    .line 70
    if-ltz v4, :cond_3

    .line 71
    .line 72
    const-string v5, "."

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-interface {v3, v4}, Le37;->f(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    sget-object v4, Lpz2;->W0:Lpz2;

    .line 86
    .line 87
    if-ne v3, v4, :cond_2

    .line 88
    .line 89
    const-string v3, "[<debug info disabled>]"

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget-object v4, Loy1;->F0:Loy1;

    .line 96
    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    const-string v4, "[\'"

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v3, "\']"

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method

.method public m()V
    .locals 5

    .line 1
    iget v0, p0, Leb9;->Y:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget-object v1, p0, Leb9;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Leb9;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    new-array v1, v0, [I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_0

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    aput v4, v1, v3

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, [I

    .line 30
    .line 31
    const/16 v3, 0xe

    .line 32
    .line 33
    invoke-static {v2, v2, v3, v0, v1}, Leu;->h0(III[I[I)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Leb9;->g0:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method

.method public declared-synchronized o(Lbb9;)Lfb9;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "MessengerIpcClient"

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lbb9;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Queueing "

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lxa9;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lxa9;->a(Lbb9;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Lxa9;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lxa9;-><init>(Leb9;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Leb9;->g0:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lxa9;->a(Lbb9;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p1, p1, Lbb9;->b:Lz18;

    .line 44
    .line 45
    iget-object p1, p1, Lz18;->a:Lfb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-object p1

    .line 49
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, Leb9;->X:B

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
    invoke-virtual {p0}, Leb9;->l()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
