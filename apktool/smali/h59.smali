.class public final Lh59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ll01;
.implements La94;


# instance fields
.field public final X:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final Y:Lr01;

.field public Z:Z

.field public f0:Lg94;

.field public g0:Lzy0;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lr01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh59;->X:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, Lh59;->Y:Lr01;

    .line 7
    .line 8
    sget-object p1, Lnr4;->d:Lzy0;

    .line 9
    .line 10
    iput-object p1, p0, Lh59;->g0:Lzy0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lh59;->Z:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lh59;->Z:Z

    .line 7
    .line 8
    iget-object v0, p0, Lh59;->X:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget v2, Lg46;->wrapped_composition_tag:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lh59;->f0:Lg94;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Lg94;->f(Lc94;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput-object v3, p0, Lh59;->f0:Lg94;

    .line 28
    .line 29
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->l0:Lhq1;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v1, v1, Lhq1;->Y:Liq1;

    .line 34
    .line 35
    invoke-virtual {v1}, Liq1;->invoke()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->l0:Lhq1;

    .line 39
    .line 40
    :cond_2
    iget-object p0, p0, Lh59;->Y:Lr01;

    .line 41
    .line 42
    invoke-virtual {p0}, Lr01;->m()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final b(Lrn2;)V
    .locals 2

    .line 1
    new-instance v0, Lf59;

    .line 2
    .line 3
    check-cast p1, Lzy0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v1}, Lf59;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lh59;->X:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setOnReadyForComposition(Lgn2;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final k(Ld94;Ln84;)V
    .locals 0

    .line 1
    sget-object p1, Ln84;->ON_DESTROY:Ln84;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh59;->a()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Ln84;->ON_CREATE:Ln84;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lh59;->Z:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lh59;->g0:Lzy0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lh59;->b(Lrn2;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
