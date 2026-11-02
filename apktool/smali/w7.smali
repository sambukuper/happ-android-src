.class public final Lw7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic X:La8;

.field public final synthetic Y:Lx7;


# direct methods
.method public constructor <init>(Lx7;La8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw7;->Y:Lx7;

    .line 5
    .line 6
    iput-object p2, p0, Lw7;->X:La8;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lw7;->Y:Lx7;

    .line 2
    .line 3
    iget-object p2, p1, Lx7;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Landroid/content/DialogInterface$OnClickListener;

    .line 6
    .line 7
    iget-object p0, p0, Lw7;->X:La8;

    .line 8
    .line 9
    iget-object p4, p0, La8;->b:Lc8;

    .line 10
    .line 11
    invoke-interface {p2, p4, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p1, Lx7;->b:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La8;->b:Lc8;

    .line 19
    .line 20
    invoke-virtual {p0}, Lyp;->dismiss()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
