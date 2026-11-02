.class public abstract Lek3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lfl1;

.field public static final b:Lfl1;

.field public static final c:Lfl1;

.field public static final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lfl1;

    .line 2
    .line 3
    sget-object v1, Lvl3;->f0:Lvl3;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lfl1;-><init>(Ll5;B)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lek3;->a:Lfl1;

    .line 11
    .line 12
    new-instance v2, Lfl1;

    .line 13
    .line 14
    sget-object v3, Lxl3;->f0:Lxl3;

    .line 15
    .line 16
    const/16 v4, 0xa

    .line 17
    .line 18
    invoke-direct {v2, v3, v4}, Lfl1;-><init>(Ll5;B)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lek3;->b:Lfl1;

    .line 22
    .line 23
    new-instance v4, Lfl1;

    .line 24
    .line 25
    sget-object v5, Lwl3;->f0:Lwl3;

    .line 26
    .line 27
    const/16 v6, 0xb

    .line 28
    .line 29
    invoke-direct {v4, v5, v6}, Lfl1;-><init>(Ll5;B)V

    .line 30
    .line 31
    .line 32
    sput-object v4, Lek3;->c:Lfl1;

    .line 33
    .line 34
    new-instance v6, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v6, Lek3;->d:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v6, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static a(Ljd1;Led1;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    const-class v2, Ltf5;

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ltf5;

    .line 12
    .line 13
    invoke-static {p1, v2, v1}, Lbl1;->h(Led1;Ljava/lang/Class;Z)Led1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ltf5;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    check-cast p0, Luf5;

    .line 24
    .line 25
    iget-object p0, p0, Luf5;->i0:Lfk2;

    .line 26
    .line 27
    check-cast p1, Luf5;

    .line 28
    .line 29
    iget-object p1, p1, Luf5;->i0:Lfk2;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lfk2;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    return v0

    .line 38
    :cond_0
    return v1

    .line 39
    :cond_1
    const/4 p0, 0x3

    .line 40
    new-array p0, p0, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities"

    .line 44
    .line 45
    packed-switch p1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const-string v3, "what"

    .line 49
    .line 50
    aput-object v3, p0, v1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_0
    aput-object v2, p0, v1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    const-string v3, "visibility"

    .line 57
    .line 58
    aput-object v3, p0, v1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    const-string v3, "second"

    .line 62
    .line 63
    aput-object v3, p0, v1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    const-string v3, "first"

    .line 67
    .line 68
    aput-object v3, p0, v1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_4
    const-string v3, "from"

    .line 72
    .line 73
    aput-object v3, p0, v1

    .line 74
    .line 75
    :goto_0
    aput-object v2, p0, v0

    .line 76
    .line 77
    const-string v0, "areInSamePackage"

    .line 78
    .line 79
    aput-object v0, p0, p1

    .line 80
    .line 81
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 82
    .line 83
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Li86;Ljd1;Led1;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lld0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lld0;

    .line 7
    .line 8
    invoke-static {v0}, Lbl1;->r(Lld0;)Lld0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget v0, Lbl1;->a:I

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    :goto_0
    invoke-static {v0, p2}, Lek3;->a(Ljd1;Led1;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    sget-object v0, Lgl1;->c:Lfl1;

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1, p2}, Lfl1;->a(Li86;Ljd1;Led1;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method
