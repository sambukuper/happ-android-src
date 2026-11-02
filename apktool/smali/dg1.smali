.class public final Ldg1;
.super Lwe7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Lbg1;

.field public d:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Lbg1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg1;->c:Lbg1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 5
    .line 6
    iget-object v0, p0, Ldg1;->c:Lbg1;

    .line 7
    .line 8
    iget-object v0, v0, Lcw0;->X:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lxe7;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lxe7;->c(Lwe7;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-boolean p0, v0, Lxe7;->g:Z

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v1, 0x1a

    .line 25
    .line 26
    if-lt p0, v1, :cond_2

    .line 27
    .line 28
    invoke-static {p1}, Lue3;->K(Landroid/animation/AnimatorSet;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x2

    .line 36
    invoke-static {p0}, Lml2;->K(I)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Lxe7;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldg1;->c:Lbg1;

    .line 5
    .line 6
    iget-object p1, p1, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lxe7;

    .line 9
    .line 10
    iget-object v0, p0, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lxe7;->c(Lwe7;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    invoke-static {p0}, Lml2;->K(I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final c(Lj00;Landroid/view/ViewGroup;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Ldg1;->c:Lbg1;

    .line 5
    .line 6
    iget-object p2, p2, Lcw0;->X:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lxe7;

    .line 9
    .line 10
    iget-object v0, p0, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2, p0}, Lxe7;->c(Lwe7;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v1, 0x22

    .line 21
    .line 22
    if-lt p0, v1, :cond_5

    .line 23
    .line 24
    iget-object p0, p2, Lxe7;->c:Lqk2;

    .line 25
    .line 26
    iget-boolean p0, p0, Lqk2;->o0:Z

    .line 27
    .line 28
    if-eqz p0, :cond_5

    .line 29
    .line 30
    const/4 p0, 0x2

    .line 31
    invoke-static {p0}, Lml2;->K(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Lxe7;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->getTotalDuration()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iget p1, p1, Lj00;->c:F

    .line 45
    .line 46
    long-to-float v3, v1

    .line 47
    mul-float/2addr p1, v3

    .line 48
    float-to-long v3, p1

    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    cmp-long p1, v3, v5

    .line 52
    .line 53
    const-wide/16 v5, 0x1

    .line 54
    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    move-wide v3, v5

    .line 58
    :cond_2
    cmp-long p1, v3, v1

    .line 59
    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    sub-long v3, v1, v5

    .line 63
    .line 64
    :cond_3
    invoke-static {p0}, Lml2;->K(I)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Lxe7;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-static {v0, v3, v4}, Lue3;->T(Landroid/animation/AnimatorSet;J)V

    .line 77
    .line 78
    .line 79
    :cond_5
    return-void
.end method

.method public final d(Landroid/view/ViewGroup;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldg1;->c:Lbg1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcw0;->w0()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lbg1;->F0(Landroid/content/Context;)Lmj0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lmj0;->Z:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    iput-object v1, p0, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 33
    .line 34
    iget-object v0, v0, Lcw0;->X:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, v0

    .line 37
    check-cast v5, Lxe7;

    .line 38
    .line 39
    iget-object v0, v5, Lxe7;->c:Lqk2;

    .line 40
    .line 41
    iget-object v1, v5, Lxe7;->a:Lze7;

    .line 42
    .line 43
    sget-object v2, Lze7;->f0:Lze7;

    .line 44
    .line 45
    if-ne v1, v2, :cond_2

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    :goto_1
    move v4, v1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v1, 0x0

    .line 51
    goto :goto_1

    .line 52
    :goto_2
    iget-object v3, v0, Lqk2;->J0:Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    new-instance v1, Lcg1;

    .line 62
    .line 63
    move-object v6, p0

    .line 64
    move-object v2, p1

    .line 65
    invoke-direct/range {v1 .. v6}, Lcg1;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLxe7;Ldg1;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move-object v6, p0

    .line 73
    :goto_3
    iget-object p0, v6, Ldg1;->d:Landroid/animation/AnimatorSet;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0, v3}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_4
    return-void
.end method
