.class public final Lo70;
.super Lk70;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lo70;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lo70;->b:Landroid/view/KeyEvent$Callback;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final e(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p0, p0, Lo70;->a:B

    .line 2
    .line 3
    return-void
.end method

.method public final c(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-byte p1, p0, Lo70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lo70;->b:Landroid/view/KeyEvent$Callback;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;

    .line 9
    .line 10
    sget p1, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->s0:I

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->d(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 p1, 0x5

    .line 17
    if-ne p2, p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Lq70;

    .line 20
    .line 21
    invoke-virtual {p0}, Lq70;->cancel()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
