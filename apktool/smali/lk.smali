.class public final Llk;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Ll97;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lwl6;

.field public final d:Lc1;

.field public final e:Ldq;

.field public f:Z

.field public g:F

.field public h:Ljk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llk;->i:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ldq;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ll97;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ll97;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Llk;->a:Ll97;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Llk;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Lwl6;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v0, p0, v2}, Lwl6;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Llk;->c:Lwl6;

    .line 26
    .line 27
    new-instance v0, Lc1;

    .line 28
    .line 29
    const/4 v2, 0x5

    .line 30
    invoke-direct {v0, p0, v2}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Llk;->d:Lc1;

    .line 34
    .line 35
    iput-boolean v1, p0, Llk;->f:Z

    .line 36
    .line 37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 38
    .line 39
    iput v0, p0, Llk;->g:F

    .line 40
    .line 41
    iput-object p1, p0, Llk;->e:Ldq;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ltf7;)V
    .locals 4

    .line 1
    iget-object v0, p0, Llk;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Llk;->e:Ldq;

    .line 10
    .line 11
    iget-object v1, v1, Ldq;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/view/Choreographer;

    .line 14
    .line 15
    new-instance v2, Lkk;

    .line 16
    .line 17
    iget-object v3, p0, Llk;->d:Lc1;

    .line 18
    .line 19
    invoke-direct {v2, v3}, Lkk;-><init>(Lc1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 23
    .line 24
    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x21

    .line 28
    .line 29
    if-lt v1, v2, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroid/animation/ValueAnimator;->getDurationScale()F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Llk;->g:F

    .line 36
    .line 37
    iget-object v1, p0, Llk;->h:Ljk;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    new-instance v1, Ljk;

    .line 42
    .line 43
    invoke-direct {v1, p0}, Ljk;-><init>(Llk;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Llk;->h:Ljk;

    .line 47
    .line 48
    :cond_0
    iget-object p0, v1, Ljk;->a:Lik;

    .line 49
    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    new-instance p0, Lik;

    .line 53
    .line 54
    invoke-direct {p0, v1}, Lik;-><init>(Ljk;)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v1, Ljk;->a:Lik;

    .line 58
    .line 59
    invoke-static {p0}, Landroid/animation/ValueAnimator;->registerDurationScaleChangeListener(Landroid/animation/ValueAnimator$DurationScaleChangeListener;)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Llk;->e:Ldq;

    .line 6
    .line 7
    iget-object p0, p0, Ldq;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/os/Looper;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-ne v0, p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
