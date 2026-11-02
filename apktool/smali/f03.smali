.class public final Lf03;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lf03;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lf03;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lf03;->b:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lf03;->a:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Lf03;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lf03;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lc19;

    .line 14
    .line 15
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iget-object v0, p0, Lc19;->a:Lb19;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lb19;->e(F)V

    .line 20
    .line 21
    .line 22
    check-cast v4, Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v4, p0}, Ly09;->f(Landroid/view/View;Lc19;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast v4, Lvt;

    .line 29
    .line 30
    invoke-virtual {v4, p1}, Ll97;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    check-cast p0, Landroidx/transition/Transition;

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/transition/Transition;->p0:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    check-cast v4, Landroid/view/View;

    .line 42
    .line 43
    check-cast p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 44
    .line 45
    iput-object v3, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->l:Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    iget-byte p0, p0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->k:B

    .line 48
    .line 49
    if-ne p0, v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_2
    check-cast v4, Landroid/view/View;

    .line 62
    .line 63
    check-cast p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 64
    .line 65
    iput-object v3, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->k:Landroid/view/ViewPropertyAnimator;

    .line 66
    .line 67
    iget-byte p0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->j:B

    .line 68
    .line 69
    if-ne p0, v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lf03;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lf03;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroidx/transition/Transition;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/transition/Transition;->p0:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
