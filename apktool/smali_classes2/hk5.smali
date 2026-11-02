.class public final Lhk5;
.super Landroidx/recyclerview/widget/l;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final u:Lfu6;

.field public final v:Lvz7;


# direct methods
.method public constructor <init>(Lik5;Lfu6;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lfu6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/l;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lhk5;->u:Lfu6;

    .line 9
    .line 10
    new-instance p2, La23;

    .line 11
    .line 12
    const/16 v0, 0xb

    .line 13
    .line 14
    invoke-direct {p2, p0, p1, v0}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Lvz7;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lvz7;-><init>(Ldn2;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lhk5;->v:Lvz7;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final r()Lgk5;
    .locals 0

    .line 1
    iget-object p0, p0, Lhk5;->v:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgk5;

    .line 8
    .line 9
    return-object p0
.end method
