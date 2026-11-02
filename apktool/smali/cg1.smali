.class public final Lcg1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Lxe7;

.field public final synthetic e:Ldg1;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;ZLxe7;Ldg1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcg1;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    iput-object p2, p0, Lcg1;->b:Landroid/view/View;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcg1;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcg1;->d:Lxe7;

    .line 8
    .line 9
    iput-object p5, p0, Lcg1;->e:Ldg1;

    .line 10
    .line 11
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcg1;->a:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iget-object v0, p0, Lcg1;->b:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, Lcg1;->c:Z

    .line 12
    .line 13
    iget-object v2, p0, Lcg1;->d:Lxe7;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v2, Lxe7;->a:Lze7;

    .line 18
    .line 19
    sget-object v3, Lze7;->f0:Lze7;

    .line 20
    .line 21
    if-ne v1, v3, :cond_1

    .line 22
    .line 23
    :cond_0
    iget-object v1, v2, Lxe7;->a:Lze7;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, p1}, Lze7;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p0, p0, Lcg1;->e:Ldg1;

    .line 32
    .line 33
    iget-object p1, p0, Ldg1;->c:Lbg1;

    .line 34
    .line 35
    iget-object p1, p1, Lcw0;->X:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lxe7;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lxe7;->c(Lwe7;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x2

    .line 43
    invoke-static {p0}, Lml2;->K(I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method
