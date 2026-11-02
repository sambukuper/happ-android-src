.class public final synthetic Lpf7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:Lrf7;

.field public final synthetic Y:I


# direct methods
.method public synthetic constructor <init>(Lrf7;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpf7;->X:Lrf7;

    .line 5
    .line 6
    iput p2, p0, Lpf7;->Y:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lpf7;->X:Lrf7;

    .line 2
    .line 3
    iget-object p1, p1, Lrf7;->Y:Lsu/happ/proxyutility/ui/widget/CustomSpinner;

    .line 4
    .line 5
    iget p0, p0, Lpf7;->Y:I

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lsu/happ/proxyutility/ui/widget/CustomSpinner;->setSelection(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lsu/happ/proxyutility/ui/widget/CustomSpinner;->onDetachedFromWindow()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
