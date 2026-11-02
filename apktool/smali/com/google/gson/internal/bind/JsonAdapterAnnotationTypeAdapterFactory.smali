.class public final Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvg8;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory;
    }
.end annotation


# static fields
.field public static final Z:Lvg8;

.field public static final f0:Lvg8;


# instance fields
.field public final X:Lmj0;

.field public final Y:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->Z:Lvg8;

    .line 8
    .line 9
    new-instance v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory$DummyTypeAdapterFactory;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->f0:Lvg8;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lmj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->X:Lmj0;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/gson/a;Lyi8;)Lcom/google/gson/b;
    .locals 7

    .line 1
    iget-object v0, p2, Lyi8;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Lwm3;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v5, v0

    .line 10
    check-cast v5, Lwm3;

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v2, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->X:Lmj0;

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    move-object v1, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p2

    .line 22
    invoke-virtual/range {v1 .. v6}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->b(Lmj0;Lcom/google/gson/a;Lyi8;Lwm3;Z)Lcom/google/gson/b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final b(Lmj0;Lcom/google/gson/a;Lyi8;Lwm3;Z)Lcom/google/gson/b;
    .locals 7

    .line 1
    invoke-interface {p4}, Lwm3;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lyi8;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v1, v0}, Lmj0;->P(Lyi8;Z)La85;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, La85;->d()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p4}, Lwm3;->nullSafe()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    instance-of p4, p1, Lcom/google/gson/b;

    .line 24
    .line 25
    if-eqz p4, :cond_0

    .line 26
    .line 27
    check-cast p1, Lcom/google/gson/b;

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    instance-of p4, p1, Lvg8;

    .line 32
    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    check-cast p1, Lvg8;

    .line 36
    .line 37
    if-eqz p5, :cond_1

    .line 38
    .line 39
    iget-object p4, p3, Lyi8;->a:Ljava/lang/Class;

    .line 40
    .line 41
    iget-object p0, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->Y:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-virtual {p0, p4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lvg8;

    .line 48
    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    move-object p1, p0

    .line 52
    :cond_1
    invoke-interface {p1, p2, p3}, Lvg8;->a(Lcom/google/gson/a;Lyi8;)Lcom/google/gson/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    instance-of p0, p1, Lww2;

    .line 58
    .line 59
    const/4 p4, 0x0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    instance-of v0, p1, Lyn3;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p1, p3, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 76
    .line 77
    invoke-static {p1}, Lnr4;->W(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 82
    .line 83
    const-string p3, "Invalid attempt to bind an instance of "

    .line 84
    .line 85
    const-string p5, " as a @JsonAdapter for "

    .line 86
    .line 87
    invoke-static {p3, p0, p5, p1, p2}, Lem7;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object p4

    .line 91
    :cond_4
    :goto_0
    if-eqz p0, :cond_5

    .line 92
    .line 93
    move-object p0, p1

    .line 94
    check-cast p0, Lww2;

    .line 95
    .line 96
    move-object v1, p0

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move-object v1, p4

    .line 99
    :goto_1
    instance-of p0, p1, Lyn3;

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    move-object p4, p1

    .line 104
    check-cast p4, Lyn3;

    .line 105
    .line 106
    :cond_6
    move-object v2, p4

    .line 107
    if-eqz p5, :cond_7

    .line 108
    .line 109
    sget-object p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->Z:Lvg8;

    .line 110
    .line 111
    :goto_2
    move-object v5, p0

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    sget-object p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->f0:Lvg8;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :goto_3
    new-instance v0, Lcom/google/gson/internal/bind/TreeTypeAdapter;

    .line 117
    .line 118
    move-object v3, p2

    .line 119
    move-object v4, p3

    .line 120
    invoke-direct/range {v0 .. v6}, Lcom/google/gson/internal/bind/TreeTypeAdapter;-><init>(Lww2;Lyn3;Lcom/google/gson/a;Lyi8;Lvg8;Z)V

    .line 121
    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    move-object p1, v0

    .line 125
    :goto_4
    if-eqz p1, :cond_8

    .line 126
    .line 127
    if-eqz v6, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/google/gson/b;->a()Lcom/google/gson/b;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_8
    return-object p1
.end method
