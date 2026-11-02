.class public final Lyv7;
.super Lkv7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final u:Lc6;

.field public final v:Lf63;


# direct methods
.method public constructor <init>(Ldw7;Lc6;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lc6;->i0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/l;-><init>(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lyv7;->u:Lc6;

    .line 12
    .line 13
    new-instance v0, Lf63;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0, p2}, Lf63;-><init>(Ldw7;Lyv7;Lc6;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lyv7;->v:Lf63;

    .line 19
    .line 20
    return-void
.end method
