.class public final Lkq4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Liq4;

.field public final synthetic b:Llq4;


# direct methods
.method public constructor <init>(Llq4;Liq4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkq4;->b:Llq4;

    .line 5
    .line 6
    iput-object p2, p0, Lkq4;->a:Liq4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkq4;->b:Llq4;

    .line 2
    .line 3
    iget-object v0, v0, Ljq4;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkq4;->a:Liq4;

    .line 8
    .line 9
    invoke-interface {p0}, Liq4;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkq4;->a:Liq4;

    .line 2
    .line 3
    invoke-interface {p0}, Liq4;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkq4;->b:Llq4;

    .line 2
    .line 3
    iget-object v0, v0, Ljq4;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lj00;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lj00;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkq4;->a:Liq4;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Liq4;->b(Lj00;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkq4;->b:Llq4;

    .line 2
    .line 3
    iget-object v0, v0, Ljq4;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lj00;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lj00;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkq4;->a:Liq4;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Liq4;->c(Lj00;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
