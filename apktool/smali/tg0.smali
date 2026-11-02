.class public final synthetic Ltg0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lly0;ILjava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, Ltg0;->X:B

    iput-object p1, p0, Ltg0;->Z:Ljava/lang/Object;

    iput p2, p0, Ltg0;->Y:I

    iput-object p3, p0, Ltg0;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxg0;Lwg0;Lte6;I)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput-byte p2, p0, Ltg0;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltg0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Ltg0;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput p4, p0, Ltg0;->Y:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, Ltg0;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Ltg0;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Ltg0;->Y:I

    .line 6
    .line 7
    iget-object p0, p0, Ltg0;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lly0;

    .line 13
    .line 14
    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    .line 15
    .line 16
    new-instance v0, Landroid/content/Intent;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {p0, v2, v1, v0}, Lly0;->a(IILandroid/content/Intent;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    check-cast p0, Lly0;

    .line 39
    .line 40
    check-cast v1, Lg4;

    .line 41
    .line 42
    iget-object v0, v1, Lg4;->a:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v1, p0, Lly0;->a:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/String;

    .line 55
    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    iget-object v2, p0, Lly0;->e:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lp6;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v3, v2, Lp6;->a:Lj6;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v3, 0x0

    .line 73
    :goto_0
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v2, p0, Lly0;->g:Landroid/os/Bundle;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lly0;->f:Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v2, v2, Lp6;->a:Lj6;

    .line 87
    .line 88
    iget-object p0, p0, Lly0;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-interface {v2, v0}, Lj6;->c(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    return-void

    .line 100
    :pswitch_1
    check-cast p0, Lxg0;

    .line 101
    .line 102
    check-cast v1, Lte6;

    .line 103
    .line 104
    invoke-static {v1}, Lwg0;->c(Lte6;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p0, v0, v2}, Lxg0;->d(II)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
