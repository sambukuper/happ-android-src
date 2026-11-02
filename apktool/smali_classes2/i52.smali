.class public final Li52;
.super Landroidx/recyclerview/widget/l;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final u:Lzz2;

.field public final v:Llr;


# direct methods
.method public constructor <init>(Lj52;Lzz2;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lzz2;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/l;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Li52;->u:Lzz2;

    .line 9
    .line 10
    new-instance v0, Llr;

    .line 11
    .line 12
    invoke-direct {v0, p1, p0, p2}, Llr;-><init>(Lj52;Li52;Lzz2;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Li52;->v:Llr;

    .line 16
    .line 17
    return-void
.end method
