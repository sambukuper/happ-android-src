.class public final Lk97;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrj2;


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lal5;I)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lk97;->a:B

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lk97;->c:Ljava/lang/Object;

    .line 46
    iput p2, p0, Lk97;->b:I

    const/4 p0, 0x0

    .line 47
    const-string p1, "The minimum number of digits ("

    if-ltz p2, :cond_1

    const/16 v0, 0x9

    if-gt p2, v0, :cond_0

    return-void

    .line 48
    :cond_0
    const-string v0, ") exceeds the length of an Int"

    .line 49
    invoke-static {p1, p2, v0}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-static {p1}, Lem7;->c(Ljava/lang/Object;)V

    throw p0

    .line 51
    :cond_1
    const-string v0, ") is negative"

    .line 52
    invoke-static {p1, p2, v0}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 53
    invoke-static {p1}, Lem7;->c(Ljava/lang/Object;)V

    throw p0
.end method

.method public constructor <init>(Lal5;IB)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput-byte p3, p0, Lk97;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk97;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lk97;->b:I

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    const-string p1, "The minimum number of digits ("

    .line 13
    .line 14
    if-ltz p2, :cond_1

    .line 15
    .line 16
    const/16 p3, 0x9

    .line 17
    .line 18
    if-gt p2, p3, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p3, ") exceeds the length of an Int"

    .line 22
    .line 23
    invoke-static {p1, p2, p3}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lem7;->c(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    const-string p3, ") is negative"

    .line 32
    .line 33
    invoke-static {p1, p2, p3}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lem7;->c(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method

.method public constructor <init>(Lrj2;I)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lk97;->a:B

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lk97;->c:Ljava/lang/Object;

    .line 43
    iput p2, p0, Lk97;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lk97;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lk97;->b:I

    .line 5
    .line 6
    iget-object p0, p0, Lk97;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lal5;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lal5;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    sub-int/2addr v2, p1

    .line 32
    :goto_0
    if-ge v1, v2, :cond_0

    .line 33
    .line 34
    const/16 p1, 0x30

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    check-cast p0, Lrj2;

    .line 52
    .line 53
    invoke-interface {p0, p1, v0, p3}, Lrj2;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    sub-int/2addr v2, p1

    .line 65
    :goto_1
    if-ge v1, v2, :cond_1

    .line 66
    .line 67
    const/16 p1, 0x20

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    sget-object v0, Lyn0;->d:[I

    .line 80
    .line 81
    new-instance v3, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    check-cast p0, Lal5;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lal5;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p3, :cond_2

    .line 99
    .line 100
    if-gez p0, :cond_2

    .line 101
    .line 102
    neg-int p0, p0

    .line 103
    :cond_2
    const/4 p1, 0x4

    .line 104
    aget p1, v0, p1

    .line 105
    .line 106
    if-lt p0, p1, :cond_3

    .line 107
    .line 108
    const/16 p1, 0x2b

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    add-int/lit8 p3, v2, -0x1

    .line 118
    .line 119
    aget p3, v0, p3

    .line 120
    .line 121
    if-ge p1, p3, :cond_5

    .line 122
    .line 123
    if-ltz p0, :cond_4

    .line 124
    .line 125
    aget p1, v0, v2

    .line 126
    .line 127
    add-int/2addr p0, p1

    .line 128
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    aget p1, v0, v2

    .line 140
    .line 141
    sub-int/2addr p0, p1

    .line 142
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x1

    .line 146
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
