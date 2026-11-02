.class public abstract Leb4;
.super Landroidx/recyclerview/widget/f;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Liv;


# direct methods
.method public constructor <init>(Lnr4;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/f;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldb4;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ldb4;-><init>(Leb4;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Liv;

    .line 10
    .line 11
    new-instance v2, Lwl6;

    .line 12
    .line 13
    const/4 v3, 0x5

    .line 14
    invoke-direct {v2, p0, v3}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Lnr4;->b:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v3

    .line 20
    :try_start_0
    sget-object v4, Lnr4;->c:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-static {v4}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sput-object v4, Lnr4;->c:Ljava/util/concurrent/ExecutorService;

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
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    new-instance v3, Ldq;

    .line 36
    .line 37
    const/16 v5, 0x13

    .line 38
    .line 39
    invoke-direct {v3, v4, p1, v5}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, v3}, Liv;-><init>(Lwl6;Ldq;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Leb4;->c:Liv;

    .line 46
    .line 47
    iget-object p0, v1, Liv;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    iget-object p0, p0, Leb4;->c:Liv;

    .line 2
    .line 3
    iget-object p0, p0, Liv;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
