.class public final Lc11;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrj2;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p2, p0, Lc11;->a:B

    iput-object p1, p0, Lc11;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lc11;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lc11;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lc11;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lc11;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lal5;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lal5;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    sget-object p1, Lyn0;->d:[I

    .line 21
    .line 22
    const/4 p3, 0x2

    .line 23
    aget p1, p1, p3

    .line 24
    .line 25
    add-int/lit16 v0, p0, -0x7d0

    .line 26
    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    if-ge v0, p1, :cond_0

    .line 30
    .line 31
    rem-int/2addr p0, p1

    .line 32
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    rsub-int/lit8 p1, p1, 0x2

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const-string v1, "0"

    .line 48
    .line 49
    invoke-static {p1, v1}, Lmm7;->V(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-array v1, p3, [Ljava/lang/CharSequence;

    .line 54
    .line 55
    aput-object p1, v1, v0

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    aput-object p0, v1, p1

    .line 59
    .line 60
    :goto_0
    if-ge v0, p3, :cond_2

    .line 61
    .line 62
    aget-object p0, v1, v0

    .line 63
    .line 64
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    if-ltz p0, :cond_1

    .line 71
    .line 72
    const-string p1, "+"

    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void

    .line 85
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lqg5;

    .line 108
    .line 109
    iget-object v1, v0, Lqg5;->X:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lgn2;

    .line 112
    .line 113
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lrj2;

    .line 116
    .line 117
    invoke-interface {v1, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_3

    .line 128
    .line 129
    invoke-interface {v0, p1, p2, p3}, Lrj2;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V

    .line 130
    .line 131
    .line 132
    :cond_4
    return-void

    .line 133
    :pswitch_2
    check-cast p0, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lrj2;

    .line 150
    .line 151
    invoke-interface {v0, p1, p2, p3}, Lrj2;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
