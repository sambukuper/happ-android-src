.class public abstract Lqc4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lyu6;

.field public c:I

.field public d:Z

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:I

.field public h:Z

.field public i:Z

.field public final j:Lxb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqc4;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lqc4;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lyu6;

    .line 12
    .line 13
    invoke-direct {v0}, Lyu6;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lqc4;->b:Lyu6;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lqc4;->c:I

    .line 20
    .line 21
    sget-object v0, Lqc4;->k:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v0, p0, Lqc4;->f:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Lxb;

    .line 26
    .line 27
    const/16 v2, 0x11

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lqc4;->j:Lxb;

    .line 33
    .line 34
    iput-object v0, p0, Lqc4;->e:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    iput v0, p0, Lqc4;->g:I

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lqc4;->a:Ljava/lang/Object;

    .line 42
    new-instance v0, Lyu6;

    invoke-direct {v0}, Lyu6;-><init>()V

    iput-object v0, p0, Lqc4;->b:Lyu6;

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lqc4;->c:I

    .line 44
    sget-object v1, Lqc4;->k:Ljava/lang/Object;

    iput-object v1, p0, Lqc4;->f:Ljava/lang/Object;

    .line 45
    new-instance v1, Lxb;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, Lxb;-><init>(Ljava/lang/Object;B)V

    iput-object v1, p0, Lqc4;->j:Lxb;

    .line 46
    iput-object p1, p0, Lqc4;->e:Ljava/lang/Object;

    .line 47
    iput v0, p0, Lqc4;->g:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lys;->y()Lys;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "Cannot invoke "

    .line 24
    .line 25
    const-string v1, " on a background thread"

    .line 26
    .line 27
    invoke-static {v0, p0, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final b(Lpc4;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lpc4;->Y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lpc4;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    invoke-virtual {p1, p0}, Lpc4;->a(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget v0, p1, Lpc4;->Z:I

    .line 18
    .line 19
    iget v1, p0, Lqc4;->g:I

    .line 20
    .line 21
    if-lt v0, v1, :cond_2

    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :cond_2
    iput v1, p1, Lpc4;->Z:I

    .line 25
    .line 26
    iget-object p1, p1, Lpc4;->X:Lv85;

    .line 27
    .line 28
    iget-object p0, p0, Lqc4;->e:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p0}, Lv85;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final c(Lpc4;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lqc4;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lqc4;->i:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean v1, p0, Lqc4;->h:Z

    .line 10
    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lqc4;->i:Z

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lqc4;->b(Lpc4;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    new-instance v1, Lwu6;

    .line 22
    .line 23
    iget-object v2, p0, Lqc4;->b:Lyu6;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Lwu6;-><init>(Lyu6;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v2, Lyu6;->Z:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v2, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {v1}, Lwu6;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-virtual {v1}, Lwu6;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lpc4;

    .line 52
    .line 53
    invoke-virtual {p0, v2}, Lqc4;->b(Lpc4;)V

    .line 54
    .line 55
    .line 56
    iget-boolean v2, p0, Lqc4;->i:Z

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lqc4;->i:Z

    .line 61
    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    iput-boolean v0, p0, Lqc4;->h:Z

    .line 65
    .line 66
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqc4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lqc4;->k:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final e(Lsu/happ/proxyutility/ui/BaseActivity;Lv85;)V
    .locals 3

    .line 1
    const-string v0, "observe"

    .line 2
    .line 3
    invoke-static {v0}, Lqc4;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 7
    .line 8
    iget-object v1, v0, Lg94;->i:Lo84;

    .line 9
    .line 10
    sget-object v2, Lo84;->X:Lo84;

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v1, Loc4;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2}, Loc4;-><init>(Lqc4;Lsu/happ/proxyutility/ui/BaseActivity;Lv85;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lqc4;->b:Lyu6;

    .line 21
    .line 22
    invoke-virtual {p0, p2, v1}, Lyu6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lpc4;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lpc4;->c(Lsu/happ/proxyutility/ui/BaseActivity;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p0, "Cannot add the same observer with different lifecycles"

    .line 38
    .line 39
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    :goto_0
    if-eqz p0, :cond_3

    .line 44
    .line 45
    :goto_1
    return-void

    .line 46
    :cond_3
    invoke-virtual {v0, v1}, Lg94;->a(Lc94;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final f(Lv85;)V
    .locals 1

    .line 1
    const-string v0, "observeForever"

    .line 2
    .line 3
    invoke-static {v0}, Lqc4;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lnc4;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lpc4;-><init>(Lqc4;Lv85;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lqc4;->b:Lyu6;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lyu6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lpc4;

    .line 18
    .line 19
    instance-of p1, p0, Loc4;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    invoke-virtual {v0, p0}, Lpc4;->a(Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const-string p0, "Cannot add the same observer with different lifecycles"

    .line 32
    .line 33
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public g()V
    .locals 0

    .line 1
    return-void
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(Lv85;)V
    .locals 3

    .line 1
    const-string v0, "removeObserver"

    .line 2
    .line 3
    invoke-static {v0}, Lqc4;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqc4;->b:Lyu6;

    .line 7
    .line 8
    iget-object v0, p0, Lyu6;->Z:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    iget-object v1, p0, Lyu6;->X:Lvu6;

    .line 11
    .line 12
    :goto_0
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, v1, Lvu6;->X:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v1, v1, Lvu6;->Z:Lvu6;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    const/4 p1, 0x0

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    goto :goto_5

    .line 30
    :cond_2
    iget v2, p0, Lyu6;->f0:I

    .line 31
    .line 32
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    iput v2, p0, Lyu6;->f0:I

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lxu6;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Lxu6;->a(Lvu6;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget-object v0, v1, Lvu6;->f0:Lvu6;

    .line 67
    .line 68
    iget-object v2, v1, Lvu6;->Z:Lvu6;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    iput-object v2, v0, Lvu6;->Z:Lvu6;

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iput-object v2, p0, Lyu6;->X:Lvu6;

    .line 76
    .line 77
    :goto_3
    iget-object v2, v1, Lvu6;->Z:Lvu6;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    iput-object v0, v2, Lvu6;->f0:Lvu6;

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    iput-object v0, p0, Lyu6;->Y:Lvu6;

    .line 85
    .line 86
    :goto_4
    iput-object p1, v1, Lvu6;->Z:Lvu6;

    .line 87
    .line 88
    iput-object p1, v1, Lvu6;->f0:Lvu6;

    .line 89
    .line 90
    iget-object p1, v1, Lvu6;->Y:Ljava/lang/Object;

    .line 91
    .line 92
    :goto_5
    check-cast p1, Lpc4;

    .line 93
    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    invoke-virtual {p1}, Lpc4;->b()V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    invoke-virtual {p1, p0}, Lpc4;->a(Z)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "setValue"

    .line 2
    .line 3
    invoke-static {v0}, Lqc4;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lqc4;->g:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lqc4;->g:I

    .line 11
    .line 12
    iput-object p1, p0, Lqc4;->e:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lqc4;->c(Lpc4;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
