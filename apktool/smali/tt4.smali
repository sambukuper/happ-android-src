.class public final Ltt4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public a:Lq02;

.field public final b:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Lwt4;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltt4;->b:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltt4;->a:Lq02;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lq02;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lst4;

    .line 8
    .line 9
    iget-object p0, p0, Lst4;->n:Lnt4;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lnt4;->h:Z

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lnt4;->p(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
