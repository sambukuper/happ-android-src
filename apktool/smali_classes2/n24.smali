.class public final Ln24;
.super Landroidx/recyclerview/widget/l;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final u:Lqi3;

.field public final v:Lq02;


# direct methods
.method public constructor <init>(Lo24;Lqi3;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lqi3;->Y:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/l;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ln24;->u:Lqi3;

    .line 7
    .line 8
    new-instance v0, Lq02;

    .line 9
    .line 10
    invoke-direct {v0, p1, p0, p2}, Lq02;-><init>(Lo24;Ln24;Lqi3;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ln24;->v:Lq02;

    .line 14
    .line 15
    return-void
.end method
