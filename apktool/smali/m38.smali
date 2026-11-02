.class public final Lm38;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Drawable;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lm38;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lm38;->Y:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lm38;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    iget-object p0, p0, Lm38;->Y:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0x10

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ldw0;

    .line 17
    .line 18
    iget-wide v6, p1, Ldw0;->a:J

    .line 19
    .line 20
    check-cast p2, Llp2;

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p3, p1, 0x11

    .line 29
    .line 30
    if-eq p3, v4, :cond_0

    .line 31
    .line 32
    move v3, v5

    .line 33
    :cond_0
    and-int/2addr p1, v5

    .line 34
    invoke-virtual {p2, p1, v3}, Llp2;->N(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object p1, Lts2;->Z:Lts2;

    .line 41
    .line 42
    invoke-virtual {p1, p0, p2, v2}, Lts2;->b(Landroid/graphics/drawable/Drawable;Llp2;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p2}, Llp2;->Q()V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v1

    .line 50
    :pswitch_0
    check-cast p1, Ldw0;

    .line 51
    .line 52
    iget-wide v6, p1, Ldw0;->a:J

    .line 53
    .line 54
    check-cast p2, Llp2;

    .line 55
    .line 56
    check-cast p3, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    and-int/lit8 p3, p1, 0x11

    .line 63
    .line 64
    if-eq p3, v4, :cond_2

    .line 65
    .line 66
    move v3, v5

    .line 67
    :cond_2
    and-int/2addr p1, v5

    .line 68
    invoke-virtual {p2, p1, v3}, Llp2;->N(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    sget-object p1, Lts2;->Z:Lts2;

    .line 75
    .line 76
    invoke-virtual {p1, p0, p2, v2}, Lts2;->b(Landroid/graphics/drawable/Drawable;Llp2;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2}, Llp2;->Q()V

    .line 81
    .line 82
    .line 83
    :goto_1
    return-object v1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
