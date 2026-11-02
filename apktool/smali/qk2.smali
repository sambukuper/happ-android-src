.class public abstract Lqk2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Ld94;
.implements Lfx8;
.implements Liz2;
.implements Lyv6;


# static fields
.field public static final c1:Ljava/lang/Object;


# instance fields
.field public A0:I

.field public B0:Ljava/lang/String;

.field public C0:Z

.field public D0:Z

.field public E0:Z

.field public F0:Z

.field public G0:Z

.field public H0:Z

.field public I0:Landroid/view/ViewGroup;

.field public J0:Landroid/view/View;

.field public K0:Z

.field public L0:Z

.field public M0:Lnk2;

.field public N0:Z

.field public O0:Landroid/view/LayoutInflater;

.field public P0:Z

.field public Q0:Ljava/lang/String;

.field public R0:Lo84;

.field public S0:Lg94;

.field public final T0:Lf51;

.field public U0:Lgm2;

.field public final V0:Lyz4;

.field public W0:Lzv6;

.field public X:I

.field public X0:Lxd6;

.field public Y:Landroid/os/Bundle;

.field public final Y0:Lq02;

.field public Z:Landroid/util/SparseArray;

.field public final Z0:Ljava/util/ArrayList;

.field public final a1:Llk2;

.field public final b1:Llk2;

.field public f0:Landroid/os/Bundle;

.field public g0:Ljava/lang/String;

.field public h0:Landroid/os/Bundle;

.field public i0:Lqk2;

.field public j0:Ljava/lang/String;

.field public k0:I

.field public l0:Ljava/lang/Boolean;

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public q0:Z

.field public r0:Z

.field public s0:Z

.field public t0:Z

.field public u0:I

.field public v0:Lml2;

.field public w0:Ltk2;

.field public x0:Lml2;

.field public y0:Lqk2;

.field public z0:I


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
    sput-object v0, Lqk2;->c1:Ljava/lang/Object;

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
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lqk2;->X:I

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lqk2;->g0:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lqk2;->j0:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lqk2;->l0:Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v0, Lml2;

    .line 23
    .line 24
    invoke-direct {v0}, Lml2;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lqk2;->x0:Lml2;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lqk2;->G0:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lqk2;->L0:Z

    .line 33
    .line 34
    new-instance v1, Lxb;

    .line 35
    .line 36
    const/16 v2, 0x8

    .line 37
    .line 38
    invoke-direct {v1, p0, v2}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lo84;->g0:Lo84;

    .line 42
    .line 43
    iput-object v1, p0, Lqk2;->R0:Lo84;

    .line 44
    .line 45
    new-instance v1, Lf51;

    .line 46
    .line 47
    invoke-direct {v1}, Lf51;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lqk2;->T0:Lf51;

    .line 51
    .line 52
    new-instance v1, Lyz4;

    .line 53
    .line 54
    invoke-direct {v1}, Lqc4;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lqk2;->V0:Lyz4;

    .line 58
    .line 59
    new-instance v1, Lq02;

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    invoke-direct {v1, p0, v2}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, Lqk2;->Y0:Lq02;

    .line 66
    .line 67
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lqk2;->Z0:Ljava/util/ArrayList;

    .line 78
    .line 79
    new-instance v1, Llk2;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    invoke-direct {v1, p0, v2}, Llk2;-><init>(Lqk2;B)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lqk2;->a1:Llk2;

    .line 86
    .line 87
    new-instance v1, Llk2;

    .line 88
    .line 89
    invoke-direct {v1, p0, v0}, Llk2;-><init>(Lqk2;B)V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lqk2;->b1:Llk2;

    .line 93
    .line 94
    invoke-virtual {p0}, Lqk2;->q()V

    .line 95
    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public B()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public C(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    iget-object p1, p0, Lqk2;->w0:Ltk2;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lqk2;->x0:Lml2;

    .line 16
    .line 17
    iget-object p0, p0, Lml2;->f:Lbl2;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const-string p0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    .line 24
    .line 25
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public D()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public G()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public H()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public I(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public J(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public K(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lqk2;->x0:Lml2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lml2;->R()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lqk2;->t0:Z

    .line 8
    .line 9
    new-instance v0, Lgm2;

    .line 10
    .line 11
    invoke-virtual {p0}, Lqk2;->e()Lex8;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ljk2;

    .line 16
    .line 17
    const/16 v3, 0xd

    .line 18
    .line 19
    invoke-direct {v2, p0, v3}, Ljk2;-><init>(Lqk2;B)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1, v2}, Lgm2;-><init>(Lqk2;Lex8;Ljk2;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lqk2;->U0:Lgm2;

    .line 26
    .line 27
    new-instance v0, Lj0;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1, p2, p3}, Lj0;-><init>(Lqk2;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lqk2;->Y0:Lq02;

    .line 33
    .line 34
    const-string p2, "Fragment#onCreateView"

    .line 35
    .line 36
    invoke-virtual {p1, v0, p2}, Lq02;->S(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lqk2;->J0:Landroid/view/View;

    .line 40
    .line 41
    iget-object p2, p0, Lqk2;->U0:Lgm2;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p2}, Lgm2;->g()V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    invoke-static {p1}, Lml2;->K(I)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    iget-object p1, p0, Lqk2;->J0:Landroid/view/View;

    .line 56
    .line 57
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lqk2;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object p1, p0, Lqk2;->J0:Landroid/view/View;

    .line 64
    .line 65
    iget-object p2, p0, Lqk2;->U0:Lgm2;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget p3, Lv36;->view_tree_lifecycle_owner:I

    .line 71
    .line 72
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lqk2;->J0:Landroid/view/View;

    .line 76
    .line 77
    iget-object p2, p0, Lqk2;->U0:Lgm2;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget p3, Lw36;->view_tree_view_model_store_owner:I

    .line 83
    .line 84
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lqk2;->J0:Landroid/view/View;

    .line 88
    .line 89
    iget-object p2, p0, Lqk2;->U0:Lgm2;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget p3, Lz36;->view_tree_saved_state_registry_owner:I

    .line 95
    .line 96
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lqk2;->V0:Lyz4;

    .line 100
    .line 101
    iget-object p0, p0, Lqk2;->U0:Lgm2;

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Lqc4;->j(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_1
    iget-object p1, p2, Lgm2;->g0:Lg94;

    .line 108
    .line 109
    if-nez p1, :cond_2

    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    iput-object p1, p0, Lqk2;->U0:Lgm2;

    .line 113
    .line 114
    return-void

    .line 115
    :cond_2
    const-string p0, "Called getViewLifecycleOwner() but onCreateView() returned null"

    .line 116
    .line 117
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final L()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqk2;->Y:Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "savedInstanceState"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    new-instance v1, Ljk2;

    .line 14
    .line 15
    const/16 v2, 0x11

    .line 16
    .line 17
    invoke-direct {v1, p0, v0, v2}, Ljk2;-><init>(Lqk2;Landroid/os/Bundle;B)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lqk2;->Y0:Lq02;

    .line 21
    .line 22
    const-string v2, "Fragment#onViewCreated"

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lq02;->S(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lqk2;->x0:Lml2;

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-virtual {p0, v0}, Lml2;->v(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final M()Landroidx/fragment/app/FragmentActivity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqk2;->i()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "Fragment "

    .line 9
    .line 10
    const-string v1, " not attached to an activity."

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final N()Landroid/content/Context;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqk2;->k()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "Fragment "

    .line 9
    .line 10
    const-string v1, " not attached to a context."

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final O()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->J0:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Fragment "

    .line 7
    .line 8
    const-string v1, " did not return a View from onCreateView() or this was called before onCreateView()."

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final P(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->M0:Lnk2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Lqk2;->g()Lnk2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput p1, v0, Lnk2;->b:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lqk2;->g()Lnk2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput p2, p1, Lnk2;->c:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lqk2;->g()Lnk2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput p3, p1, Lnk2;->d:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lqk2;->g()Lnk2;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iput p4, p0, Lnk2;->e:I

    .line 37
    .line 38
    return-void
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Lml2;->P()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const-string p0, "Fragment already added and state has been saved"

    .line 17
    .line 18
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    :goto_1
    iput-object p1, p0, Lqk2;->h0:Landroid/os/Bundle;

    .line 23
    .line 24
    return-void
.end method

.method public a()Lvj8;
    .locals 1

    .line 1
    new-instance v0, Lmk2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lmk2;-><init>(Lqk2;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c()Lbx8;
    .locals 3

    .line 1
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Lqk2;->W0:Lzv6;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    instance-of v2, v0, Landroid/app/Application;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Landroid/app/Application;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-static {v0}, Lml2;->K(I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    :cond_2
    new-instance v0, Lzv6;

    .line 58
    .line 59
    iget-object v2, p0, Lqk2;->h0:Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-direct {v0, v1, p0, v2}, Lzv6;-><init>(Landroid/app/Application;Lyv6;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lqk2;->W0:Lzv6;

    .line 65
    .line 66
    :cond_3
    return-object v0

    .line 67
    :cond_4
    const-string p0, "Can\'t access ViewModels from detached fragment"

    .line 68
    .line 69
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method

.method public final d()Lsz4;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Landroid/app/Application;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Landroid/app/Application;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-static {v1}, Lml2;->K(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    :cond_2
    new-instance v1, Lsz4;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-direct {v1, v2}, Lsz4;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v1, Lo71;->a:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    sget-object v3, Lax8;->d:Lf08;

    .line 59
    .line 60
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_3
    sget-object v0, Lsv6;->a:Lwe5;

    .line 64
    .line 65
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v0, Lsv6;->b:Lg55;

    .line 69
    .line 70
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lqk2;->h0:Landroid/os/Bundle;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    sget-object v0, Lsv6;->c:Lwe5;

    .line 78
    .line 79
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_4
    return-object v1
.end method

.method public final e()Lex8;
    .locals 3

    .line 1
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {p0}, Lqk2;->m()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 14
    .line 15
    iget-object v0, v0, Lml2;->O:Lpl2;

    .line 16
    .line 17
    iget-object v0, v0, Lpl2;->d:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object v1, p0, Lqk2;->g0:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lex8;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    new-instance v1, Lex8;

    .line 30
    .line 31
    invoke-direct {v1}, Lex8;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lqk2;->g0:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object v1

    .line 40
    :cond_1
    const-string p0, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2
    const-string p0, "Can\'t access ViewModels from detached fragment"

    .line 47
    .line 48
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x1

    .line 6
    return p0
.end method

.method public final f()Lxd6;
    .locals 0

    .line 1
    iget-object p0, p0, Lqk2;->X0:Lxd6;

    .line 2
    .line 3
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lxd6;

    .line 6
    .line 7
    return-object p0
.end method

.method public final g()Lnk2;
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->M0:Lnk2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnk2;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lqk2;->c1:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object v1, v0, Lnk2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, v0, Lnk2;->h:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v1, v0, Lnk2;->i:Ljava/lang/Object;

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v1, v0, Lnk2;->j:F

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-object v1, v0, Lnk2;->k:Landroid/view/View;

    .line 24
    .line 25
    iput-object v0, p0, Lqk2;->M0:Lnk2;

    .line 26
    .line 27
    :cond_0
    return-object v0
.end method

.method public final h()Lg94;
    .locals 0

    .line 1
    iget-object p0, p0, Lqk2;->S0:Lg94;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Landroidx/fragment/app/FragmentActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lqk2;->w0:Ltk2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Ltk2;->B0:Landroidx/appcompat/app/AppCompatActivity;

    .line 8
    .line 9
    return-object p0
.end method

.method public final j()Lml2;
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->w0:Ltk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lqk2;->x0:Lml2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string v0, "Fragment "

    .line 9
    .line 10
    const-string v1, " has not been attached yet."

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final k()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lqk2;->w0:Ltk2;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 8
    .line 9
    return-object p0
.end method

.method public final l()Landroid/view/LayoutInflater;
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->O0:Landroid/view/LayoutInflater;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lqk2;->C(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lqk2;->O0:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final m()I
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->R0:Lo84;

    .line 2
    .line 3
    sget-object v1, Lo84;->Y:Lo84;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lqk2;->y0:Lqk2;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lqk2;->y0:Lqk2;

    .line 17
    .line 18
    invoke-virtual {p0}, Lqk2;->m()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final n()Lml2;
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "Fragment "

    .line 7
    .line 8
    const-string v1, " not associated with a fragment manager."

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final o()Landroid/content/res/Resources;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public final p(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqk2;->o()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final q()V
    .locals 3

    .line 1
    new-instance v0, Lg94;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lg94;-><init>(Ld94;Z)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lqk2;->S0:Lg94;

    .line 8
    .line 9
    new-instance v0, Lxv6;

    .line 10
    .line 11
    new-instance v1, Lhr5;

    .line 12
    .line 13
    const/16 v2, 0xe

    .line 14
    .line 15
    invoke-direct {v1, p0, v2}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lxv6;-><init>(Lyv6;Lhr5;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lxd6;

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    invoke-direct {v1, v0, v2}, Lxd6;-><init>(Lxv6;B)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lqk2;->X0:Lxd6;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lqk2;->W0:Lzv6;

    .line 31
    .line 32
    iget-object v0, p0, Lqk2;->Z0:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v1, p0, Lqk2;->a1:Llk2;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget v2, p0, Lqk2;->X:I

    .line 43
    .line 44
    if-ltz v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, Llk2;->a()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    iget-object v1, p0, Lqk2;->b1:Llk2;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget p0, p0, Lqk2;->X:I

    .line 62
    .line 63
    if-ltz p0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, Llk2;->a()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lqk2;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lqk2;->g0:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lqk2;->Q0:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lqk2;->g0:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lqk2;->m0:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lqk2;->n0:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lqk2;->p0:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lqk2;->q0:Z

    .line 26
    .line 27
    iput-boolean v0, p0, Lqk2;->s0:Z

    .line 28
    .line 29
    iput v0, p0, Lqk2;->u0:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lqk2;->v0:Lml2;

    .line 33
    .line 34
    new-instance v2, Lml2;

    .line 35
    .line 36
    invoke-direct {v2}, Lml2;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Lqk2;->x0:Lml2;

    .line 40
    .line 41
    iput-object v1, p0, Lqk2;->w0:Ltk2;

    .line 42
    .line 43
    iput v0, p0, Lqk2;->z0:I

    .line 44
    .line 45
    iput v0, p0, Lqk2;->A0:I

    .line 46
    .line 47
    iput-object v1, p0, Lqk2;->B0:Ljava/lang/String;

    .line 48
    .line 49
    iput-boolean v0, p0, Lqk2;->C0:Z

    .line 50
    .line 51
    iput-boolean v0, p0, Lqk2;->D0:Z

    .line 52
    .line 53
    return-void
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->w0:Ltk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lqk2;->m0:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final t()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lqk2;->C0:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lqk2;->y0:Lqk2;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move p0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lqk2;->t()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    return v1

    .line 27
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "{"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "} ("

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lqk2;->g0:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lqk2;->z0:I

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    const-string v1, " id=0x"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v1, p0, Lqk2;->z0:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v1, p0, Lqk2;->B0:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const-string v1, " tag="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lqk2;->B0:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_1
    const-string p0, ")"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget p0, p0, Lqk2;->u0:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public v()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    return-void
.end method

.method public w(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    invoke-static {p1}, Lml2;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lqk2;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public x(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqk2;->w0:Ltk2;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, v0, Ltk2;->B0:Landroidx/appcompat/app/AppCompatActivity;

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iput-boolean p1, p0, Lqk2;->H0:Z

    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public y(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lqk2;->H0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqk2;->Y:Landroid/os/Bundle;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "childFragmentManager"

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lqk2;->x0:Lml2;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lml2;->X(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lqk2;->x0:Lml2;

    .line 23
    .line 24
    iput-boolean v1, v0, Lml2;->H:Z

    .line 25
    .line 26
    iput-boolean v1, v0, Lml2;->I:Z

    .line 27
    .line 28
    iget-object v2, v0, Lml2;->O:Lpl2;

    .line 29
    .line 30
    iput-boolean v1, v2, Lpl2;->g:Z

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lml2;->v(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p0, p0, Lqk2;->x0:Lml2;

    .line 36
    .line 37
    iget v0, p0, Lml2;->v:I

    .line 38
    .line 39
    if-lt v0, p1, :cond_1

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iput-boolean v1, p0, Lml2;->H:Z

    .line 43
    .line 44
    iput-boolean v1, p0, Lml2;->I:Z

    .line 45
    .line 46
    iget-object v0, p0, Lml2;->O:Lpl2;

    .line 47
    .line 48
    iput-boolean v1, v0, Lpl2;->g:Z

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lml2;->v(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
