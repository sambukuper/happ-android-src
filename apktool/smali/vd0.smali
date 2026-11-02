.class public final Lvd0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final Y:I

.field public final Z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILnx8;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, Lvd0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lvd0;->Y:I

    .line 8
    .line 9
    iput-object p2, p0, Lvd0;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lvd0;->X:B

    iput-object p1, p0, Lvd0;->Z:Ljava/lang/Object;

    iput p2, p0, Lvd0;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-byte v0, p0, Lvd0;->X:B

    .line 2
    .line 3
    iget v1, p0, Lvd0;->Y:I

    .line 4
    .line 5
    iget-object p0, p0, Lvd0;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Li89;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Li89;->c(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->o0(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast p0, Landroidx/leanback/widget/SearchBar;

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/leanback/widget/SearchBar;->z0:Landroid/util/SparseIntArray;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->get(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v2, p0, Landroidx/leanback/widget/SearchBar;->y0:Landroid/media/SoundPool;

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/high16 v8, 0x3f800000    # 1.0f

    .line 34
    .line 35
    const/high16 v4, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/high16 v5, 0x3f800000    # 1.0f

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    invoke-virtual/range {v2 .. v8}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    check-cast p0, Lwq4;

    .line 45
    .line 46
    iget-object p0, p0, Lwq4;->k1:Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->o0(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_3
    check-cast p0, Lrb8;

    .line 53
    .line 54
    iget-object p0, p0, Lrb8;->Y:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lwl7;

    .line 57
    .line 58
    if-eqz p0, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lwl7;->S(I)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
